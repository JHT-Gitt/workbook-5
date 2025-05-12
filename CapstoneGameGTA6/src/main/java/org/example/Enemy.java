package org.example;

public class Enemy extends Character {
    public Enemy(String name, int hp, int attack) {
        super(name, hp, attack);
    }
    void makeMove(Character target){
        System.out.println(name + " unleashes Double Damage NullNullification Fist  " + target.name + " is wiped out instantly!");
        target.hp = 0;
    }
}
