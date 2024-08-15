package org.example.graphics;

import javax.swing.*;
import java.awt.*;

public class Background {
    private Image backgroundImage;

    public Background(String path) {
        backgroundImage = new ImageIcon(path).getImage(); // Example: "resources/background.png"
    }

    public void draw(Graphics g, int width, int height) {
        g.drawImage(backgroundImage, 0, 0, width, height, null);
    }
}
