import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        
        int A = input.nextInt();
        int N;

        do {
            N = input.nextInt();
        } while (N <= 0);

        int sum = 0;
        for (int i = 0; i < N; i++) {
            sum += (A + i);
        }

        System.out.println(sum);
            
    }
 
}
