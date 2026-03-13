public class Person {
    // TODO: Make 'name' and 'age' private
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // TODO: Complete the setName method
    public void setName(String name) {
        this.name = name;
    }

    // TODO: Complete the setAge method
    public void setAge(int age) {
        this.age = age;
    }

    // TODO: Complete the getName method
    public String getName() {
        return name;
    }

    // TODO: Complete the getAge method
    public int getAge() {
        return age;
    }
}

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Alice", 30);
        // TODO: Use setName and setAge methods
        person.setName("Bob");
        person.setAge(25);

        // TODO: Print the 'name' and 'age' attributes using the getter methods
        System.out.println("Name: " + person.getName() + ", Age: " + person.getAge());
    }
}
