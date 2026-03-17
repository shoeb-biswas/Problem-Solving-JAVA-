public class Animal{
    public void makeSound(){
        System.out.println("Animal makes a sound");
    }
    public void makeSound(String sound){
        System.out.println("Animal says: " + sound);
    }
}

public class Dog extends Animal{
    public void makeSound(){
        System.out.println("Bark");
    }
}

public class Cat extends Animal{
    public void makeSound(){
        System.out.println("Meow");
    }
}

public class Main {
    public static void main(String[] args) {
        // TODO: Demonstrate compile-time polymorphism by calling both makeSound methods on an Animal object
        Animal a = new Animal();
        a.makeSound();
        a.makeSound("Roar");
        
        // TODO: Demonstrate runtime polymorphism by creating Dog and Cat objects using Animal references and calling the methods
        
        Animal c = new Cat();
        Animal d = new Dog();
        c.makeSound();
        d.makeSound();
    }
}
