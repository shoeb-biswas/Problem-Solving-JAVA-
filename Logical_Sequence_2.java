import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int X = input.nextInt();
        int Y = input.nextInt();
        
        for (int i = 1; i <= Y; i++) {
            System.out.print(i);
            
            if (i % X != 0 && i != Y) {
                System.out.print(" ");
            } else {
                System.out.println();
            }
        }

    }
}
