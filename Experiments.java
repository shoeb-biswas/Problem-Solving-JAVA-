import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt();
        int total = 0, rabbits = 0, rats = 0, frogs = 0;
        
        for (int i = 0; i < N; i++) {
            int amount = scanner.nextInt();
            char type = scanner.next().charAt(0);
            
            total += amount;
            
            switch (type) {
                case 'C':
                    rabbits += amount;
                    break;
                case 'R':
                    rats += amount;
                    break;
                case 'S':
                    frogs += amount;
                    break;
            }
        }
        
        System.out.println("Total: " + total + " cobaias");
        System.out.println("Total de coelhos: " + rabbits);
        System.out.println("Total de ratos: " + rats);
        System.out.println("Total de sapos: " + frogs);
        
        System.out.printf("Percentual de coelhos: %.2f %%\n", (rabbits * 100.0 / total));
        System.out.printf("Percentual de ratos: %.2f %%\n", (rats * 100.0 / total));
        System.out.printf("Percentual de sapos: %.2f %%\n", (frogs * 100.0 / total));
        
    }
}
