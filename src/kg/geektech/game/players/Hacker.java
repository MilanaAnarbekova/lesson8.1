package kg.geektech.game.players;

import java.util.Random;

//Создать героя Hacker,
// который будет через раунд забирать у Босса N-ое количество здоровья и переводить его одному из героев.
public class Hacker extends Hero {
    boolean active = true;

    public Hacker(int health, int damage) {
        super(health, damage, SuperAbility.HACK);
    }

    @Override
    public void applySuperPower(Hero[] heroes, Boss boss) {
        Random random = new Random();
        int hackerHack = random.nextInt(20) + 1;


        if (active == true) {
            if (heroes[0].getHealth() > 0) {
                boss.setHealth(boss.getHealth() - hackerHack);
                heroes[0].setHealth(heroes[0].getHealth() + hackerHack);
                System.out.println("Hacker hill him " + heroes[0].getClass().getSimpleName());
                active = false;
            }

        } else {
            System.out.println("Hacker don't hill ");
            active = true;

        }
    }
}

