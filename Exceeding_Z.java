import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        
        int X = sc.nextInt();
        int Z;
        
        do {
            Z = sc.nextInt();
        } while (Z <= X);
        
        int sum = X;
        int count = 1;
        while (sum <= Z) {
            X++;
            sum += X;
            count++;
        }
        System.out.println(count);
        
            }
            
    }
