public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class Student extends Person {
    private String major;

    // TODO: Modify the constructor to include the major of the student
    public Student(String name, int age, String major) {
        super(name, age);
        this.major = major;
    }

    // TODO: Create a displayMajor() method to display the student's major
    public void displayMajor(){
        System.out.println("Mejor: " + major);
    }
}

public class Main {
    public static void main(String[] args) {
        // TODO: Create a Student object with the name "Bob", age 25, and major "Computer Science"
        Student student = new Student("Bob", 25, "Computer Science");
        // TODO: Call the display() method to show the student's name and age
        student.display();
        // TODO: Call the displayMajor() method to show the student's major
        student.displayMajor();
    }
}
