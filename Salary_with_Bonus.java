import java.io.IOException;
import java.util.Scanner;
public class Main {
  public static void main(String[] args) throws IOException {
  Scanner input = new Scanner (System.in);
        String c=input.next();
        double a=input.nextDouble(),b=input.nextDouble();
        double d=(b*0.15)+a;
        System.out.printf("TOTAL = R$ %.2f\n",d);
    }
 
}
