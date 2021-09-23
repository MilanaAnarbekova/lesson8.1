package kg.geektech.game.players;

import java.util.Random;

public class Antman extends Hero{
    public Antman(int health, int damage ) {
        super(health, damage, SuperAbility.SIZE_INCREASE);
    }

    @Override
    public void applySuperPower(Hero[] heroes, Boss boss) {
        Random random = new Random();
        boolean ant = random.nextBoolean();
        if (ant){
            this.setDamage(getDamage()+10);
            this.setHealth(getHealth()+10);
            System.out.println("Ant size increase ");
        }
        else if (!(ant)){
            this.setDamage(getDamage()-10);
            this.setHealth(getHealth()-10);
            System.out.println("Ant size not  increase ");
        }
    }
}
