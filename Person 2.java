class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        setAge(age);   // use validation here
    }

    public void setName(String name) {
        this.name = name;
    }

    // Reject negative age by setting it to 0
    public void setAge(int age) {
        if (age < 0) {
            this.age = 0;
        } else {
            this.age = age;
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

public class Main {
    public static void main(String[] args) {

        // Create person with negative age
        Person person = new Person("Alice", -5);
        System.out.println("Name: " + person.getName() + ", Age: " + person.getAge());

        person.setName("Bob");
        person.setAge(25);
        System.out.println("Name: " + person.getName() + ", Age: " + person.getAge());
    }
}
