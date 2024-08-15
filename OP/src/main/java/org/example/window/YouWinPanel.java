package org.example.window;

import org.example.main.Game;

import javax.swing.*;
import java.awt.*;

public class YouWinPanel extends JPanel {
    public YouWinPanel() {
        setLayout(new BorderLayout());
        setBackground(Color.BLACK);

        JLabel winText = new JLabel("YOU WIN", SwingConstants.CENTER);
        winText.setFont(new Font("Arial", Font.BOLD, 40));
        winText.setForeground(Color.GREEN);
        add(winText, BorderLayout.CENTER);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setBackground(Color.BLACK); // Ensures button panel blends with background

        JButton nextLevelButton = new JButton("Next Level");
        nextLevelButton.addActionListener(e -> Game.getInstance().proceedToNextLevel());

        JButton menuButton = new JButton("Menu");
        menuButton.addActionListener(e -> Game.getInstance().showGameMenu());

        buttonPanel.add(nextLevelButton);
        buttonPanel.add(menuButton);
        add(buttonPanel, BorderLayout.SOUTH);
    }
}
