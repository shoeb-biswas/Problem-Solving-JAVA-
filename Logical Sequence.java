import java.util.Scanner;
import java.io.IOException;
public class Main {
    public static void main(String[] args) throws IOException {
Scanner input=new Scanner (System.in);
int N=input.nextInt(),x,y,z,b,a;
for(int i=1;i<=N;i++){
   x=i*1;
    y=i*i;
     a=y+1;
    z=y*i;
    b=z+1;
System.out.printf("%d %d %d\n",x,y,z);
System.out.printf("%d %d %d\n",x,a,b);
}
  }
 
}
