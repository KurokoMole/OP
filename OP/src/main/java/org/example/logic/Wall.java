package org.example.logic;

import java.awt.*;

public class Wall extends Entity {
    private Image wallImage;

    public Wall(Coordinates position, Image image) {
        super(position);
        this.wallImage = image;
    }

    @Override
    public void draw(Graphics g) {
        g.drawImage(wallImage, getPosition().getX(), getPosition().getY(), null);
    }
}
