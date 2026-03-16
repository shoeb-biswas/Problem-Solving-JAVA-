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

public class Employee extends Person {
    private String employeeId;
    private String department;

    public Employee(String name, int age, String employeeId, String department) {
        super(name, age);
        this.employeeId = employeeId;
        this.department = department;
    }

    // TODO: Create a displayEmployeeDetails method that calls display() and then prints employeeId and department
    public void displayEmployeeDetails(){
        display();
        System.out.println("Employee ID: " + employeeId + ", Department: " +department);
    }
}

public class Manager extends Employee {
    // TODO: Add a private field teamSize to Manager
    private int teamSize;
    // TODO: Implement a constructor in Manager that initializes name, age, employeeId, department, and teamSize
    public Manager(String name, int age, String employeeId, String department, int teamSize){
        Employee(name, age, employeeId, department);
        this.teamSize = teamSize;
    }
    // TODO: Create a displayManagerDetails method that calls displayEmployeeDetails() and then prints teamSize
    public void displayManagerDetails(){
        displayEmployeeDetails();
        System.out.println("Team Size: " + teamSize);
    }
}

public class Main {
    public static void main(String[] args) {
        // TODO: Create a Person object with the name "Alice" and age 30
        Person person = new Person("Alice", 30);
        // TODO: Create an Employee object with the name "Bob", age 40, employeeId "E123", and department "Engineering"
        Employee employee = new Employee("Bob", 40,"E123","Engineering");
        // TODO: Create a Manager object with the name "Charlie", age 50, employeeId "M456", department "HR", and teamSize 10
        Manager manager = new Manager("Charlie",50, "M456", "HR", 10);

        // TODO: Display the details of the Manager object
        manager.displayManagerDetails();
    }
}
