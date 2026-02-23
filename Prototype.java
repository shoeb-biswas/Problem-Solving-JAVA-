public interface EmployeePrototype {
    EmployeePrototype clone(); 
}

public class Employee implements EmployeePrototype {
private String name, role, department;
private int id, salary;
public Employee(String name, int id, String department, String role, int salary) {
        this.name = name;
        this.id = id; 
        this.department = department;
        this.role = role;
        this.salary = salary;
    }
// Custom clone method (manual copying)
public EmployeePrototype clone() {
        return new Employee(this.name, this.id, this.department, this.role, this.salary); 
        //Object Create 
    }

public void setName(String name) {
        this.name = name;
    }
    public void setId(int id) {
        this.id = id;
    } 	
public void showDetails() {
        System.out.println("Name: " + name +
                ", ID: " + id +
                ", Department: " + department +
                ", Role: " + role +
                ", Salary: " + salary);
    }
}

public class HRsystem {
    public static void main(String[] args) {
        // Step 1: Create Prototype Employee
        EmployeePrototype prototypeEmp = new Employee(“Name", 000, "IT", "Software Engineer", 50000); 	// prototypeEmp is the Base Object

	    // Step 2: Clone prototype for Employee 1
        Employee emp1 = (Employee) prototypeEmp.clone(); //clone object 
        emp1.setName(“Karim");
        emp1.setId(111);

        // Step 3: Clone prototype for Employee 2
        Employee emp2 = (Employee) prototypeEmp.clone(); //clone object
        emp2.setName(“Rahim");
        emp2.setId(121);

System.out.println("Prototype Employee:");
        ((Employee) prototypeEmp).showDetails();

System.out.println("\nCloned Employees:");
        emp1.showDetails();
        emp2.showDetails();
    }
}
