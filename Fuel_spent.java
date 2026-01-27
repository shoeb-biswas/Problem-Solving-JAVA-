import java.io.IOException;
import java.util.Scanner; 
public class Main {
 
    public static void main(String[] args) throws IOException {
 Scanner input=new Scanner (System.in);
 int a=input.nextInt(),b=input.nextInt();
 double c=(a*b)/12.0;
 System.out.printf("%.3f\n",c);
 
    }
 
}
