import java.io.IOException;
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
 Scanner input=new Scanner (System.in);
 int N=input.nextInt(),h,m;
 h=N/3600;
 N=N%3600;
 m=N/60;
 N=N%60;
 System.out.printf("%d:%d:%d\n",h,m,N);
 
    }
 
}
