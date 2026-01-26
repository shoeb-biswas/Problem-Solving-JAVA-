import java.io.IOException;
 import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException {
Scanner input= new Scanner (System.in);
        double a=input.nextDouble(),b=input.nextDouble(),c=input.nextDouble(),d=input.nextDouble(),e=input.nextDouble(),f=input.nextDouble();
        double t=((c*b)+(f*e));
        System.out.printf("VALOR A PAGAR: R$ %.2f\n",t);
    }
}
