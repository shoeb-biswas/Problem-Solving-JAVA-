class Student implements Cloneable {

    private String studentId;
    private String name;
    private String department;

    public Student(String studentId, String name, String department) {
        this.studentId = studentId;
        this.name = name;
        this.department = department;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void display() {
        System.out.println("ID: " + studentId +
                           ", Name: " + name +
                           ", Department: " + department);
    }

    // Prototype cloning method
    public Student clone() {
        try {
            return (Student) super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }
}

public class PrototypeDemo {

    public static void main(String[] args) {

        // Original object
        Student original = new Student("101", "Rahim", "CSE");

        // Clone object
        Student clonedStudent = original.clone();

        // Modify only necessary attributes
        clonedStudent.setStudentId("102");
        clonedStudent.setName("Karim");

        // Display both objects
        original.display();
        clonedStudent.display();
    }
}
