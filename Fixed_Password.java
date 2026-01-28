import java.util.Scanner;
import java.io.IOException;
public class Main {
    public static void main(String[] args) throws IOException {
Scanner input=new Scanner (System.in);
while(true){
    int a=input.nextInt();
    if(a==2002){
        System.out.println("Acesso Permitido");
        break;
    }else{
       System.out.println("Senha Invalida");

    }
}

    }
 
}
