public class Person {
    // TODO: Create private field attributes for 'name' and 'age'
    private String name;
    private int age;

    // TODO: Create a constructor for 'name' and 'age'
    Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    // TODO: Create setter methods for 'name' and 'age'
    public void setName(String name){
        this.name = name;
    }
    
    public void setAge(int age){
        this.age = age;
    }

    // TODO: Create getter methods for 'name' and 'age'
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
}

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Alice", 30);

        // TODO: Change the 'name' and 'age' attributes using the setter methods instead
        person.setName("Bob");
        person.setAge(25);

        // TODO: Print the 'name' and 'age' attributes using the getter methods instead
        System.out.println("Name: " + person.getName() + ", Age: " + person.getAge());
    }
}
