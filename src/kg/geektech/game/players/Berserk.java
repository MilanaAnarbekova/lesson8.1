package kg.geektech.game.players;

import java.util.Random;

public class Berserk extends Hero {

    public Berserk(int health, int damage) {
        super(health, damage, SuperAbility.SAVE_DAMAGE_AND_REVERT);
    }

    @Override
    public void applySuperPower(Hero[] heroes, Boss boss) {
        Random random = new Random();
        int berserkBlock = random.nextInt(40) + 1;
        boss.setHealth(boss.getHealth() - (this.getDamage() +berserkBlock));
        System.out.println("Berserk use super power " + berserkBlock);


    }
}
