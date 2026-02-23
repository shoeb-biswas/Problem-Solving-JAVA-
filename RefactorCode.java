public class StudentRecord {
    private String name;
    private int[] marks;

    public StudentRecord(String name, int[] marks) {
        this.name = name;
        this.marks = marks;
    }

    public int calculateTotal() {
        int total = 0;
        for (int mark : marks) {
            total += mark;
        }
        return total;
    }

    public double calculateAverage() {
        return (double) calculateTotal() / marks.length;
    }

    public void displayResultStatus() {
        if (calculateAverage() >= 50) {
            System.out.println(name + " Passed");
        } else {
            System.out.println(name + " Failed");
        }
    }

    public void display() {
        System.out.println("Student Name: " + name);
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Subject" + (i + 1) + ": " + marks[i]);
        }
        System.out.println("Total Marks: " + calculateTotal());
        System.out.println("Average: " + calculateAverage());
    }
}
