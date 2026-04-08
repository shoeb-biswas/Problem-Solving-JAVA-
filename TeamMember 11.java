// TeamMember interface
public interface TeamMember {
    void showMemberDetails();
}
// Analyst class
public class Analyst implements TeamMember {
    private long memberId;
    private String name;
    private String role;

    // Constructor
    public Analyst(long memberId, String name, String role) {
        this.memberId = memberId;
        this.name = name;
        this.role = role;
    }

    // Override method
    @Override
    public void showMemberDetails() {
        System.out.println("Analyst -> ID: " + memberId + ", Name: " + name + ", Role: " + role);
    }
}
// TeamLead class
public class TeamLead implements TeamMember {
    private long memberId;
    private String name;
    private String role;

    // Constructor
    public TeamLead(long memberId, String name, String role) {
        this.memberId = memberId;
        this.name = name;
        this.role = role;
    }

    // Override method
    @Override
    public void showMemberDetails() {
        System.out.println("TeamLead -> ID: " + memberId + ", Name: " + name + ", Role: " + role);
    }
}

import java.util.ArrayList;
import java.util.List;

// ProjectTeam class (Composite)
public class ProjectTeam implements TeamMember {
    private String teamName;
    private List<TeamMember> members;

    // Constructor
    public ProjectTeam(String teamName) {
        this.teamName = teamName;
        this.members = new ArrayList<>();
    }

    // Add member
    public void addMember(TeamMember member) {
        members.add(member);
    }

    // Remove member
    public void removeMember(TeamMember member) {
        members.remove(member);
    }

    // Override method
    @Override
    public void showMemberDetails() {
        System.out.println("Project Team: " + teamName);
        for (TeamMember member : members) {
            member.showMemberDetails();
        }
    }
}

// Main class
public class Main {
    public static void main(String[] args) {

        // Create Analysts
        Analyst analyst1 = new Analyst(101, "Shoeb", "Data Analyst");
        Analyst analyst2 = new Analyst(102, "Rahim", "Business Analyst");

        // Create TeamLead
        TeamLead lead1 = new TeamLead(201, "Karim", "Team Lead");

        // Create ProjectTeam
        ProjectTeam projectTeam = new ProjectTeam("AI Development Team");

        // Add members
        projectTeam.addMember(analyst1);
        projectTeam.addMember(analyst2);
        projectTeam.addMember(lead1);

        // Display details
        projectTeam.showMemberDetails();
    }
}
