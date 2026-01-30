import java.util.Scanner;
import java.io.IOException;

public class Main {
       public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        
        int a = 0, b = 1, temp;
        
        for (int i = 0; i < N; i++) {
            if (i > 0) {
                System.out.print(" ");
            }
            System.out.print(a);
            temp = a + b;
            a = b;
            b = temp;
        }
        
        System.out.println();
    }
}
