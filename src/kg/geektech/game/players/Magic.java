package kg.geektech.game.players;

import java.util.Random;

public class Magic extends Hero {
    public Magic(int health, int damage) {
        super(health, damage, SuperAbility.BOOST);
    }

    @Override
    public void applySuperPower(Hero[] heroes, Boss boss) {
        Random random = new Random();
        int magicUp = random.nextInt(10) + 1;
        for (int i = 0; i < heroes.length; i++) {
            heroes[i].setDamage(getDamage() +magicUp );
            System.out.println("Magic up " + magicUp);
            break;

        }
    }
}
