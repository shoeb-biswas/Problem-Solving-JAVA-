import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int maxNumber = Integer.MIN_VALUE;
        int position = 0;
        
        for (int i = 1; i <= 100; i++) {
            int num = scanner.nextInt();
            if (num > maxNumber) {
                maxNumber = num;
                position = i;
            }
        }
        
        System.out.println(maxNumber);
        System.out.println(position);
        
    }
}
