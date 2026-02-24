import java.io.IOException;

public class StudentData {

    // Method to save student data, throws IOException if validation fails
    public void saveStudentData(String name, String id, String dept) throws IOException {
        // Check if any of the provided fields are null or empty
        if (name == null || name.trim().isEmpty() ||
            id == null || id.trim().isEmpty() ||
            dept == null || dept.trim().isEmpty()) {
            
            // Explicitly throw IOException
            throw new IOException("Validation Failed: Student name, id, or dept cannot be empty.");
        }
        
        System.out.println("Successfully saved data for student: " + name);
    }

    public static void main(String[] args) {
        StudentData studentManager = new StudentData();

        try {
            // Valid call
            System.out.println("Attempting valid entry:");
            studentManager.saveStudentData("Ayesha", "011-202-334", "Software Engineering");
            
            // Invalid call to test exception handling
            System.out.println("\nAttempting invalid entry:");
            studentManager.saveStudentData("", "011-202-335", "Software Engineering");
            
        } catch (IOException e) {
            // Handling the exception
            System.out.println("Error caught: " + e.getMessage());
        }
    }
}
