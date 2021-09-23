package kg.geektech.game.players;

import java.util.Random;

public class Thor extends Hero {

    public Thor(int health, int damage) {
        super(health, damage, SuperAbility.STUN);
    }

    @Override
    public void applySuperPower(Hero[] heroes, Boss boss) {
        Random random = new Random();
        boolean active = random.nextBoolean();
        if (active) {
            boss.setDamage(0);
            System.out.println("Boss is stunned " );
        }
    else if (!(active)) {
            boss.setDamage(boss.getDamage());
            System.out.println("Boss is not stunned ");
        }
    }
}
