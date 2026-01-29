import java.io.IOException;
public class Main {
 
    public static void main(String[] args) throws IOException {
   for (int I = 1; I <= 9; I += 2) {
            for (int J = 7; J >= 5; J--) {
                System.out.println("I=" + I + " J=" + J);
            }
        }
    }
 
}
