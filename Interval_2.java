import java.util.Scanner;
import java.io.IOException;
public class Main {
    public static void main(String[] args) throws IOException {
Scanner input = new Scanner (System.in);
    int N=input.nextInt(), X, in = 0, out = 0;
    for (int i = 0; i < N; i++) {
        X=input.nextInt();
        if (X >= 10 && X <= 20){
            in++;
       } else{
            out++;
    }
    }
    System.out.printf("%d in\n", in);
    System.out.printf("%d out\n", out);
    }
 
}
