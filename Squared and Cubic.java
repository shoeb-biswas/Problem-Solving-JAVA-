import java.util.Scanner;
import java.io.IOException;
public class Main {
    public static void main(String[] args) throws IOException {
Scanner input=new Scanner (System.in);
int N=input.nextInt(),x,y,z;
for(int i=1;i<=N;i++){
   x=i*1;
    y=i*i;
    z=y*i;
System.out.printf("%d %d %d\n",x,y,z);
}
    }
 
}
