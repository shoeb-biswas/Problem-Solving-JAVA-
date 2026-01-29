import java.util.Scanner;
import java.io.IOException;
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner input=new Scanner(System.in);
    int N=input.nextInt(), result = 1;
    if (N > 0 && N < 13) {
        for (int i = 1; i <= N; i++) {
            result *= i;
        }
        System.out.printf("%d\n", result);
    }

    }
 
}
