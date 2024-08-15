package org.example.logic;

import java.awt.*;

public class Player extends Entity {
    private Image playerImage;

    public Player(Coordinates position, String image) {
        super(position);
        this.playerImage = image;
    }

    @Override
    public void draw(Graphics g) {
        g.drawImage(playerImage, getPosition().getX(), getPosition().getY(), null);
    }
}
