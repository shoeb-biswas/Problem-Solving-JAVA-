import java.util.Scanner;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        
        int sum = 0, count = 0, age;
        
        while (true) {
            age = sc.nextInt();
            if (age < 0) break;
            sum += age;
            count++;
        }
        
        if (count > 0) {
            double average = (double) sum / count;
            System.out.printf("%.2f\n", average);
        }
        
    }
}
