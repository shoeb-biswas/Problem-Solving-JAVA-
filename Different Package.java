package personpackage;

public class Person {
    protected String nationalId = "1234567890";
}

package employeepackage;

import personpackage.Person;

public class Employee extends Person {

    public void showId() {
        System.out.println("National ID: " + nationalId);
    }

    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.showId();
    }
}
