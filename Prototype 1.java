class SystemLogger {

    private static SystemLogger instance;

    private SystemLogger() {
        System.out.println("SystemLogger initialized");
    }

    public static synchronized SystemLogger getInstance() {
        if (instance == null) {
            instance = new SystemLogger();
        }
        return instance;
    }

    public void log(String message) {
        System.out.println("[LOG] " + message);
    }
}

class CourseManagementModule {

    public void addCourse() {
        SystemLogger logger = SystemLogger.getInstance();
        logger.log("Course added successfully.");
    }
}

class OnlineExamModule {

    public void startExam() {
        SystemLogger logger = SystemLogger.getInstance();
        logger.log("Online exam started.");
    }
}

public class UniversitySystem {
    public static void main(String[] args) {

        CourseManagementModule course = new CourseManagementModule();
        OnlineExamModule exam = new OnlineExamModule();

        course.addCourse();
        exam.startExam();
    }
}
