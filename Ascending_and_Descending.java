import java.util.Scanner;
import java.io.IOException;
public class Main {
 
    public static void main(String[] args) throws IOException {
    Scanner input= new Scanner (System.in);
    while (true) {
    int x=input.nextInt(), y=input.nextInt();        
        if (x > y) {
            System.out.println("Decrescente");
        } else if (x < y) {
            System.out.println("Crescente");
        } else { 
            break;
        }
    }
    }
 
}
