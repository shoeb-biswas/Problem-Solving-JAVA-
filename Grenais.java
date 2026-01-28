import java.util.Scanner;
import java.io.IOException;
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner (System.in);
    int inter, gremio;
    int inter_wins = 0, gremio_wins = 0, draws = 0, total_matches = 0;
    int option;
    
    do {
        inter=input.nextInt();
        gremio=input.nextInt();
        total_matches++;
        
        if (inter > gremio) {
            inter_wins++;
        } else if (gremio > inter) {
            gremio_wins++;
        } else {
            draws++;
        }
        
        System.out.printf("Novo grenal (1-sim 2-nao)\n");
        option=input.nextInt();
    } while (option == 1);
    
    System.out.printf("%d grenais\n", total_matches);
    System.out.printf("Inter:%d\n", inter_wins);
    System.out.printf("Gremio:%d\n", gremio_wins);
    System.out.printf("Empates:%d\n", draws);
    
    if (inter_wins > gremio_wins) {
        System.out.printf("Inter venceu mais\n");
    } else if (gremio_wins > inter_wins) {
        System.out.printf("Gremio venceu mais\n");
    } else {
       System.out.printf("Não houve vencedor\n");
    }
    
    }
 
}
