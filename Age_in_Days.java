import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException {
Scanner input=new Scanner (System.in);
int a=input.nextInt(),y,m,d;
y=a/365;
a=a%365;
 m=a/30;
 d=a%30;
 System.out.printf("%d ano(s)\n%d mes(es)\n%d dia(s)\n",y,m,d);
    }
 
}
