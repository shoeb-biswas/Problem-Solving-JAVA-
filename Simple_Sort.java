import java.util.Scanner;
import java.io.IOException;
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner (System.in);
int x=input.nextInt(),y=input.nextInt(),z=input.nextInt(),temp;
int a=x,b=y,c=z;
if(x>y){temp=x;x=y; y=temp;}
if(x>z){temp=x;x=z; z=temp;}
if(y>z){temp=y;y=z; z=temp;}
System.out.printf("%d\n%d\n%d\n\n",x,y,z);
System.out.printf("%d\n%d\n%d\n",a,b,c);

    }
 
}
