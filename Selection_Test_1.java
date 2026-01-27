import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException {
Scanner input=new Scanner (System.in);
int a=input.nextInt(),b=input.nextInt(),c=input.nextInt(),d=input.nextInt();
int e=c+d, f=a+b;
if(b>c && d>a && e>f && c>0 && d>0 && a%2==0){
    System.out.println("Valores aceitos");
}else{
    System.out.println("Valores nao aceitos");
}
    }
 
}
