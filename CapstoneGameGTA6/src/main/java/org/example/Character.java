package org.example;

public class Character {
    String name;
    int hp;
    int attack;

    public Character(String name, int hp, int attack) {
        this.name = name;
        this.hp = hp;
        this.attack = attack;
    }
    void attack(Character target) {
        System.out.println(name + " attacks " + target.name + " for " + attack + " dmg!");
        target.hp -= attack;
    }

    void block() {
        System.out.println(name + " blocks and takes half damage next turn!");
    }

    void heal() {
        int amount = 10;
        hp += amount;
        System.out.println(name + " heals for " + amount + " HP. Now at " + hp);
    }

    void run() {
        System.out.println(name + " tries to run away... but this is a turn-based RPG, so... denied! ");
    }

    void fireball(Character target) {
        int dmg = 12;
        System.out.println(name + " casts FIREBALL on " + target.name + " for " + dmg + " 🔥 damage!");
        target.hp -= dmg;
    }

    boolean isAlive() {
        return hp > 0;
    }


}
