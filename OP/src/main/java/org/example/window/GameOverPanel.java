package org.example.window;

import org.example.main.Game;

import javax.swing.*;
import java.awt.*;

public class GameOverPanel extends JPanel {
    public GameOverPanel(int score, int level) {
        setLayout(new BorderLayout());
        setBackground(Color.BLACK);

        JLabel gameOverText = new JLabel("GAME OVER", SwingConstants.CENTER);
        gameOverText.setFont(new Font("Arial", Font.BOLD, 40));
        gameOverText.setForeground(Color.RED);
        add(gameOverText, BorderLayout.CENTER);

        JPanel buttonPanel = new JPanel();
        JButton restartButton = new JButton("Restart");
        restartButton.addActionListener(e -> Game.getInstance().startNewGame(level));

        JButton menuButton = new JButton("Menu");
        menuButton.addActionListener(e -> Game.getInstance().showGameMenu());

        buttonPanel.add(restartButton);
        buttonPanel.add(menuButton);
        add(buttonPanel, BorderLayout.SOUTH);
    }
}
