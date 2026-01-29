import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        
        for (int i = 0; i < N; i++) {
            int X = scanner.nextInt();
            int Y = scanner.nextInt();
            
            int sum = 0;
            int min = Math.min(X, Y);
            int max = Math.max(X, Y);
            
            for (int j = min + 1; j < max; j++) {
                if (j % 2 != 0) {
                    sum += j;
                }
            }
            
            System.out.println(sum);
        }
        
    }
}
