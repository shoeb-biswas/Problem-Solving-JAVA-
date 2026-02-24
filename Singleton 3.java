// Central configuration class (Singleton)
class ExamConfig {
    // Static variable to hold the single instance
    private static ExamConfig instance;
    
    private String examSchedule = "Midterm: Spring 2026 Schedule Active";
    private String gradingPolicy = "Relative Grading System";

    // Private constructor to prevent instantiation from outside
    private ExamConfig() {}

    // Global access point to get the singleton instance
    public static ExamConfig getInstance() {
        if (instance == null) {
            instance = new ExamConfig();
        }
        return instance;
    }

    public void showConfig() {
        System.out.println("Config -> Schedule: " + examSchedule + " | Grading: " + gradingPolicy);
    }

    public void showGradingPolicy() {
        System.out.println("Grading Policy: " + gradingPolicy);
    }

    public void viewInfo() {
        System.out.println("Exam Schedule: " + examSchedule);
    }
}

// Object sharing classes
class ExamOffice {
    public void showConfig() {
        ExamConfig.getInstance().showConfig();
    }
}

class TeacherPanel {
    public void showGradingPolicy() {
        ExamConfig.getInstance().showGradingPolicy();
    }
}

class StudentPortal {
    public void viewInfo() {
        ExamConfig.getInstance().viewInfo();
    }
}

// Main class
public class UniversitySystem {
    public static void main(String[] args) {
        ExamOffice office = new ExamOffice();
        TeacherPanel teacher = new TeacherPanel();
        StudentPortal student = new StudentPortal();

        // All classes are accessing the exact same configuration instance
        office.showConfig();
        teacher.showGradingPolicy();
        student.viewInfo();
        
        // Verification that it's the same instance in memory
        System.out.println("\nIs instance shared? " + 
            (ExamConfig.getInstance() == ExamConfig.getInstance())); 
    }
}
