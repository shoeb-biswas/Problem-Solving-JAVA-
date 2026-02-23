import java.util.Scanner;

class Student {
    private String id;

    public Student(String id) {
        if (id == null || id.isEmpty()) {
            throw new IllegalArgumentException("ID cannot be null or empty");
        }
        this.id = id;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Student ID: ");
        String inputId = sc.nextLine();

        Student s = new Student(inputId);
        System.out.println("Student created with ID: " + inputId);
    }
}
