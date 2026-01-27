import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException {
 Scanner input=new Scanner (System.in);
 float a=input.nextFloat();
 if(a>=0 && a<=25.0000){
     System.out.printf("Intervalo [0,25]\n");
 }else if(a>25.00001 && a<=50.0000000){
          System.out.printf("Intervalo (25,50]\n");

 }else if(a>50.00000001 && a<=100.00000000){
               System.out.printf("Intervalo (75,100]\n");

 }else{
             System.out.printf("Fora de intervalo\n");

 }
    }
 
}
