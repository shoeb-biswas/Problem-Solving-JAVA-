import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            int M = scanner.nextInt();
            int N = scanner.nextInt();
            
            if (M <= 0 || N <= 0) {
                break;
            }
            
            int min = Math.min(M, N);
            int max = Math.max(M, N);
            int sum = 0;
            
            for (int i = min; i <= max; i++) {
                System.out.print(i + " ");
                sum += i;
            }
            
            System.out.println("Sum=" + sum);
        }
        
    }
}
