package org.example.window;

import org.example.main.Game;

import javax.swing.*;
import java.awt.*;

public class HelpPanel extends JPanel {
    public HelpPanel() {
        setLayout(new BorderLayout());
        setBackground(Color.BLACK);

        JTextArea helpText = new JTextArea("Instructions:\n\n"
                + "1. Use arrow keys to move.\n"
                + "2. Collect items to win.\n"
                + "3. Avoid enemies to stay alive.");
        helpText.setFont(new Font("Arial", Font.PLAIN, 14));
        helpText.setForeground(Color.WHITE);
        helpText.setBackground(Color.BLACK);
        helpText.setEditable(false);
        add(helpText, BorderLayout.CENTER);

        JButton backButton = new JButton("Back");
        backButton.addActionListener(e -> Game.getInstance().showGameMenu());
        add(backButton, BorderLayout.SOUTH);
    }
}
