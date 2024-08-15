package org.example.logic;

import java.awt.*;

public class Enemy extends Entity {
    private Image enemyImage;

    public Enemy(Coordinates position, String image) {
        super(position);
        this.enemyImage = image;
    }

    @Override
    public void draw(Graphics g) {
        g.drawImage(enemyImage, getPosition().getX(), getPosition().getY(), null);
    }
}
