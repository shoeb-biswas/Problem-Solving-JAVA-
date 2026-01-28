import java.util.Scanner;
import java.io.IOException;
public class Main {
    public static void main(String[] args) throws IOException {
Scanner input =new Scanner (System.in);
int A=0,B=0,D=0;
    int N=input.nextInt();
    int count = 1;
    for (int i = 0; i < N; i++) {
        System.out.printf("%d %d %d PUM\n", count, count + 1, count + 2);
        count += 4;
    }
    }
 
}
