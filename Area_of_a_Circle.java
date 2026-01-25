import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException {
    double n=3.14159,R,A;
    Scanner input = new Scanner(System.in);
    R=input.nextDouble();
    A=n*R*R;
    System.out.printf("A=%.4f\n",A);
    }
 
}
