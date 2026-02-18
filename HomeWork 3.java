class Student {
    String name;
    int roll_no;
    String phone;
    String address;
}

public class Main {
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.name = "Sam";
        s1.roll_no = 1;
        s1.phone = "01700000000";
        s1.address = "Dhaka";

        Student s2 = new Student();
        s2.name = "John";
        s2.roll_no = 2;
        s2.phone = "01800000000";
        s2.address = "Chittagong";

        System.out.println("Student 1 Details:");
        System.out.println(s1.name + " " + s1.roll_no + " " + s1.phone + " " + s1.address);

        System.out.println("\nStudent 2 Details:");
        System.out.println(s2.name + " " + s2.roll_no + " " + s2.phone + " " + s2.address);
    }
}
