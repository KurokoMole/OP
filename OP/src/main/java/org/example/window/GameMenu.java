package org.example.window;

import org.example.main.Game;

import javax.swing.*;
import java.awt.*;

public class GameMenu extends JPanel {
    public GameMenu() {
        setLayout(new BorderLayout());
        setBackground(Color.DARK_GRAY);

        JLabel menuTitle = new JLabel("Game Menu", SwingConstants.CENTER);
        menuTitle.setFont(new Font("Arial", Font.BOLD, 40));
        menuTitle.setForeground(Color.WHITE);
        add(menuTitle, BorderLayout.CENTER);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setBackground(Color.DARK_GRAY);

        JButton startButton = new JButton("Start Game");
        startButton.addActionListener(e -> Game.getInstance().proceedToNextLevel());

        buttonPanel.add(startButton);
        add(buttonPanel, BorderLayout.SOUTH);
    }
}
