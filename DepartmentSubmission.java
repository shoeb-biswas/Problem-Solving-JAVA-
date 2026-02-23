public class DepartmentSubmission {
    // Volatile keyword ensures thread-safe visibility of the instance
    private static volatile DepartmentSubmission instance;
    private boolean isSubmitted;

    // Private constructor prevents instantiation from outside
    private DepartmentSubmission() {
        // Protection against reflection bypass
        if (instance != null) {
            throw new RuntimeException("Violation! A submission instance already exists for this department.");
        }
        this.isSubmitted = false;
    }

    // Global point of access
    public static DepartmentSubmission getInstance() {
        if (instance == null) {
            synchronized (DepartmentSubmission.class) {
                if (instance == null) {
                    instance = new DepartmentSubmission();
                }
            }
        }
        return instance;
    }

    public void submitQuestions() {
        if (isSubmitted) {
            throw new IllegalStateException("Questions have already been submitted. Re-submission is not allowed.");
        }
        // Logic to verify and store the submission goes here
        System.out.println("Questions submitted successfully.");
        this.isSubmitted = true;
    }
}
