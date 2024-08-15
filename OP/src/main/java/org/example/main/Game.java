package org.example.main;

import org.example.graphics.GameGraphics;
import org.example.logic.GameLogic;
import org.example.window.*;

import javax.swing.*;

public class Game {
    private static Game instance;
    private JFrame gameFrame;
    private JPanel currentPanel;
    private int currentLevel;

    private Game() {
        initialize();
    }

    public static Game getInstance() {
        if (instance == null) {
            instance = new Game();
        }
        return instance;
    }

    private void initialize() {
        gameFrame = new JFrame("My Game");
        gameFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gameFrame.setSize(800, 600);
        gameFrame.setLocationRelativeTo(null);
        gameFrame.setVisible(true);

        currentLevel = 1; // Start at level 1
        showGameMenu(); // Start by showing the main menu
    }

    public void showYouWinPanel() {
        currentPanel = new YouWinPanel();
        gameFrame.setContentPane(currentPanel);
        gameFrame.revalidate();
    }

    public void showGameMenu() {
        currentPanel = new GameMenu();
        gameFrame.setContentPane(currentPanel);
        gameFrame.revalidate();
    }

    public void proceedToNextLevel() {
        currentLevel++;
        startLevel(currentLevel); // Start the next level
    }

    private void startLevel(int level) {
        // Logic for starting a new level
        GameLogic gameLogic = new GameLogic(level);
        GameGraphics gameGraphics = new GameGraphics(gameLogic);

        currentPanel = gameGraphics;
        gameFrame.setContentPane(currentPanel);
        gameFrame.revalidate();
        gameGraphics.startGame(); // Start the game loop or similar
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Game::getInstance);
    }
}
