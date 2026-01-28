import java.util.Scanner;
import java.io.IOException;
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner (System.in);
    int x=input.nextInt(), y=input.nextInt(), temp;
    int total = 0;
        if (x > y) {
        temp = x;
        x = y;
        y = temp;
    }
        for (int num = x; num <= y; num++) {
        if (num % 13 != 0) {
            total += num;
        }
    }
        System.out.printf("%d\n", total);
    
    }
 
}
