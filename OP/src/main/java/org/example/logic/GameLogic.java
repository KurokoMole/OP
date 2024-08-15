package org.example.logic;

import java.util.ArrayList;
import java.util.List;

public class GameLogic {
    private int level;
    private int itemsCollected;
    private List<Enemy> enemies;
    private List<Item> items;
    private Player player;

    public GameLogic(int level) {
        this.enemies = new ArrayList<>();
        this.items = new ArrayList<>();
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getLevel() {
        return level;
    }

    public void initialize() {

        this.player = new Player(new Coordinates(100, 100), "Entity/penelope.png");
        this.enemies.add(new Enemy(new Coordinates(200, 200), "Entity/colin.png"));
        this.items.add(new Item(new Coordinates(300, 300), "Items/item3.png"));
    }

    public int getItemsCollected() {
        return itemsCollected;
    }

    public void setItemsCollected(int itemsCollected) {
        this.itemsCollected = itemsCollected;
    }
}
