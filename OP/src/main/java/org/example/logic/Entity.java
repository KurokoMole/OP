package org.example.logic;

import java.awt.*;

public abstract class Entity {
    private Coordinates position;

    public Entity(Coordinates position) {
        this.position = position;
    }

    public Coordinates getPosition() {
        return position;
    }

    public void setPosition(Coordinates position) {
        this.position = position;
    }

    public abstract void draw(Graphics g);
}
