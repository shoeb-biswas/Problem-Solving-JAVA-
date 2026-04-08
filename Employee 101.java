public interface Employee {
    void displayEmployeeInfo();
}

public class Tester implements Employee {
    private String testerName;
    private long testerId;
    private String testerPosition;

    public Tester(long testerId, String testerName, String testerPosition) {
        // TODO: Initialize testerId, testerName, and testerPosition
        this.testerId = testerId;
        this.testerName = testerName;
        this.testerPosition = testerPosition;
    }

    @Override
    public void displayEmployeeInfo() {
        System.out.println(testerId + " " + testerName + " " + testerPosition);
    }
}
public class Designer implements Employee {
    private String designerName;
    private long designerId;
    private String designerPosition;

    public Designer(long designerId, String designerName, String designerPosition) {
        // TODO: Initialize designerId, designerName, and designerPosition
        this.designerId = designerId;
        this.designerName = designerName;
        this.designerPosition = designerPosition;
    }

    @Override
    public void displayEmployeeInfo() {
        System.out.println(designerId + " " + designerName + " " + designerPosition);
    }
}
import java.util.ArrayList;
import java.util.List;

public class TeamDirectory implements Employee {
    private String teamName;
    // TODO: Initialize the teamList
    private List<Employee> teamList;

    // TODO: Initialize the teamName and teamList
    public TeamDirectory(String teamName) {
        this.teamName = teamName;
        this.teamList = new ArrayList<>();
    }

    @Override
    public void displayEmployeeInfo() {
        System.out.println("Team Directory: " + teamName);
        for (Employee emp : teamList) {
            emp.displayEmployeeInfo();
        }
    }

    // TODO: Implement the method to add employees to the teamList
    public void addEmployee(Employee emp) {
        teamList.add(emp);
    }

    // TODO: Implement the method to remove employees from the teamList
    public void removeEmployee(Employee emp) {
        teamList.remove(emp);
    }
}
public class Main {
    public static void main(String[] args) {
        // Create instances of Tester
        Tester tester1 = new Tester(300, "Emma Watson", "Lead Tester");
        Tester tester2 = new Tester(301, "Henry Cavill", "Junior Tester");

        // Create an instance of Designer
        Designer designer1 = new Designer(400, "Scarlett Johansson", "Senior Designer");

        // Create an instance of TeamDirectory
        TeamDirectory teamDirectory = new TeamDirectory("Quality Team");

        // Add employees to the teamDirectory
        teamDirectory.addEmployee(tester1);
        teamDirectory.addEmployee(tester2);
        teamDirectory.addEmployee(designer1);

        // Display the teamDirectory employee information
        teamDirectory.displayEmployeeInfo();
    }
}
