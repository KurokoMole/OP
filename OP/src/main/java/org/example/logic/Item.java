package org.example.logic;

import java.awt.*;

public class Item extends Entity {
    private Image itemImage;

    public Item(Coordinates position, String image) {
        super(position);
        this.itemImage = image;
    }

    @Override
    public void draw(Graphics g) {
        g.drawImage(itemImage, getPosition().getX(), getPosition().getY(), null);
    }
}
