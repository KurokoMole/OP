package org.example.graphics;

import org.example.logic.GameLogic;

import javax.swing.*;
import java.awt.*;

public class GameGraphics extends JPanel {
    private GameLogic logic;
    private Image backgroundImage;

    public GameGraphics(GameLogic logic) {
        this.logic = logic;
        setPreferredSize(new Dimension(1820, 1000));
        setBackground(Color.BLACK);
        backgroundImage = loadBackgroundImage(logic.getLevel());
    }

    private Image loadBackgroundImage(int level) {
        String path = "resources/background_level" + level + ".png"; // Insert your background images here
        ImageIcon icon = new ImageIcon(path);
        return icon.getImage();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
        // Render other game components like player, enemies, etc.
    }
}
