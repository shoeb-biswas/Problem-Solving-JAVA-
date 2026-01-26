import java.io.IOException;
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
 Scanner input =new Scanner (System.in);
 double a=input.nextDouble();
 double r=((4.0/3)*3.14159*(a*a*a));
 System.out.printf("VOLUME = %.3f\n",r);
    }
 
}
