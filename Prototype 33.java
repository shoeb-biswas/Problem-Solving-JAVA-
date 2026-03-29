public abstract class Hero implements Cloneable {

    private String alias;

    // Constructor
    public Hero(String alias) {
        this.alias = alias;
    }

    public String getAlias() {
        return alias;
    }

    // TODO: Declare an abstract method named 'cloneHero'
    public abstract Hero cloneHero();

    @Override
    protected Hero clone() {
        try {
            return (Hero) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }
}

public class FlyingHero extends Hero {

    private String power;

    public FlyingHero(String alias, String power) {
        super(alias);
        this.power = power;
    }

    public String getPower() {
        return power;
    }

    @Override
    public Hero cloneHero() {
        return new FlyingHero(getAlias(), power);
    }

    public void showDetails() {

        System.out.println("Hero Alias: " + getAlias() + ", Power: " + power);
    }
}

public class Main {
    public static void main(String[] args) {
        
        FlyingHero original = new FlyingHero("SkyDiver","Super Flight");
        FlyingHero cloned = (FlyingHero)original.cloneHero();

        original.showDetails();
        cloned.showDetails();
    }
}
