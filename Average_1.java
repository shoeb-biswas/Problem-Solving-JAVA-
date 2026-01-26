import java.io.IOException;
 import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
    Scanner input=new Scanner (System.in);
    double A=input.nextDouble(),B=input.nextDouble(),MEDIA;
    MEDIA=((A*3.5)+(B*7.5))/(3.5+7.5);
    System.out.printf("MEDIA = %.5f\n",MEDIA);
    }
 
}
