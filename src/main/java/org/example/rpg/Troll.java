package org.example.rpg;

public class Troll extends Monster implements Bleedable, Poisonable {

    public Troll(String name, int hitPoints, double damage) {
        super(name, hitPoints, damage);
    }


    @Override
    public double bleed() {
        return getDamage() * 0.25;
    }


    @Override
    public double poison() {
        return getDamage() * 0.3;
    }


    @Override
    public double attack() {
        return getDamage() + bleed() + poison();
    }

    public static void main(String[] args) {
        Troll troll = new Troll("Cave Troll", 150, 30);
        System.out.println("Troll attacks with damage: " + troll.attack());
    }
}
