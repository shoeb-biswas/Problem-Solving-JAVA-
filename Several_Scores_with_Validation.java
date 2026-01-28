import java.util.Scanner;
import java.io.IOException;
public class Main {
    public static void main(String[] args) throws IOException {
Scanner input = new Scanner (System.in);
       double score, sum;
    int count, choice;
    do {
        count = 0;
        sum = 0.0;
        while (count < 2) {
            score=input.nextDouble();
            if (score >= 0.0 && score <= 10.0) {
                sum += score;
                count++;
            } else {
                System.out.printf("nota invalida\n");
            }
        }
        System.out.printf("media = %.2f\n", sum / 2.0);
        do {
            System.out.printf("novo calculo (1-sim 2-nao)\n");
            choice=input.nextInt();
        } while (choice != 1 && choice != 2);

    } while (choice == 1);
    }
 
}
