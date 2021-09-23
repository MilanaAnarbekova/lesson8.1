package kg.geektech.game.players;

import java.util.Random;

public class Warrior extends Hero{
    public Warrior(int health, int damage) {
        super(health, damage, SuperAbility.CRITICAL_DAMAGE);
    }

    @Override
    public void applySuperPower(Hero[] heroes, Boss boss) {
        Random random = new Random();
        int warrior = random.nextInt(4) + 2;
        boss.setHealth(boss.getHealth() - this.getDamage() * warrior);
        System.out.println("Warrior attack " + (this.getDamage() * warrior));

    }
}
