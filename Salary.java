import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException {
Scanner input= new Scanner(System.in);
 int a=input.nextInt(),b=input.nextInt();
 float c=input.nextFloat();
 System.out.println("NUMBER = "+a);
 float salary=b*c;
  System.out.printf("SALARY = U$ %.2f%n",salary);
  
    }
 
}
