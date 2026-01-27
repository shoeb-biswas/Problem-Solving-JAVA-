import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException {
Scanner input=new Scanner (System.in);
            int a=input.nextInt(),r=1,result=1;
            System.out.printf("%d\n",a);
                result=a/100;
                System.out.printf("%d nota(s) de R$ 100,00\n",result);
                a=a%100;
                result=a/50;
        System.out.printf("%d nota(s) de R$ 50,00\n",result);
        a=a%50;
        result=a/20;
        System.out.printf("%d nota(s) de R$ 20,00\n",result);
        a=a%20;
        result=a/10;
        System.out.printf("%d nota(s) de R$ 10,00\n",result);
        a=a%10;
        result=a/5;
        System.out.printf("%d nota(s) de R$ 5,00\n",result);
        a=a%5;
        result=a/2;
        System.out.printf("%d nota(s) de R$ 2,00\n",result);
        a=a%2;
        result=a/1;
        System.out.printf("%d nota(s) de R$ 1,00\n",result);

    }
 
}
