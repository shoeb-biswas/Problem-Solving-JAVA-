import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException {
 Scanner input=new Scanner(System.in);
 float N1=input.nextFloat(),N2=input.nextFloat(),N3=input.nextFloat(),N4=input.nextFloat(),w,x,y,z,m,en,f;
 w=N1*2;
 x=N2*3;
 y=N3*4;
 z=N4*1;
 m=(w+x+y+z)/10;
 System.out.printf("Media: %.1f\n",m);
 if(m>=7.0){
   System.out.println("Aluno aprovado."); 
 }else if(m<5.0){
    System.out.println("Aluno reprovado.");  
 }else if(m>=5.0 && m<=6.9){
    System.out.println("Aluno em exame.");  
    en=input.nextFloat();
        System.out.printf("Nota do exame: %.1f\n",en);  
        f=(m+en)/2;
        if(f>=5.0){
            System.out.println("Aluno aprovado.");
        }else if(f<=4.9){
            System.out.println("Aluno reprovado.");
        }
      System.out.printf("Media final: %.1f\n",f); 
 }
    }
 
}
