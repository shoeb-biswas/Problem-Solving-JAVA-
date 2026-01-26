import java.io.IOException;
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
 Scanner input= new Scanner (System.in);
 double a=input.nextDouble(),b=input.nextDouble(),c=input.nextDouble();
 double r=0.5*a*c;
 double cr=3.14159*c*c;
 double ar=((a+b)/2)*c;
 double sq=b*b;
 double re=a*b;
 
 System.out.printf("TRIANGULO: %.3f\n",r);
 System.out.printf("CIRCULO: %.3f\n",cr);
 System.out.printf("TRAPEZIO: %.3f\n",ar);
 System.out.printf("QUADRADO: %.3f\n",sq);
 System.out.printf("RETANGULO: %.3f\n",re);
    }
 
}
