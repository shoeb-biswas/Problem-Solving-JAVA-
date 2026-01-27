import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException {
Scanner input=new Scanner (System.in);
double x,y,z,y1,x1,k,a=input.nextDouble(),b=input.nextDouble(),c=input.nextDouble();
 z=((b*b)-(4*a*c));
 x1=Math.sqrt(z);
x=-b+x1;
x=x/(2*a);
k=((b*b)-(4*a*c));
y1=Math.sqrt(k);
y=-b-y1;
y=y/(2*a);
if(a==0 || z<0 || k<0){
    System.out.printf("Impossivel calcular\n");
}else{
System.out.printf("R1 = %.5f\n",x);
System.out.printf("R2 = %.5f\n",y);
}
    }
 
}
