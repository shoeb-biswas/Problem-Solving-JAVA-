interface GameCharacter extends Cloneable {
    GameCharacter cloneCharacter();
    void display();
}

class Warrior implements GameCharacter {

    private int health;
    private int attack;

    public Warrior(int health, int attack) {
        this.health = health;
        this.attack = attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    @Override
    public GameCharacter cloneCharacter() {
        return new Warrior(health, attack);
    }

    public void display() {
        System.out.println("Warrior -> Health: " + health + ", Attack: " + attack);
    }
}

class Archer implements GameCharacter {

    private int health;
    private int attack;

    public Archer(int health, int attack) {
        this.health = health;
        this.attack = attack;
    }

    @Override
    public GameCharacter cloneCharacter() {
        return new Archer(health, attack);
    }

    public void display() {
        System.out.println("Archer -> Health: " + health + ", Attack: " + attack);
    }
}

class Mage implements GameCharacter {

    private int health;
    private int magic;

    public Mage(int health, int magic) {
        this.health = health;
        this.magic = magic;
    }

    @Override
    public GameCharacter cloneCharacter() {
        return new Mage(health, magic);
    }

    public void display() {
        System.out.println("Mage -> Health: " + health + ", Magic Power: " + magic);
    }
}

public class GameClient {
    public static void main(String[] args) {

        Warrior originalWarrior = new Warrior(100, 50);
        Warrior clonedWarrior = (Warrior) originalWarrior.cloneCharacter();

        clonedWarrior.setAttack(80);

        originalWarrior.display();
        clonedWarrior.display();
    }
}
