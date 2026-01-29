import java.io.IOException;
public class Main {
 
    public static void main(String[] args) throws IOException {
        int I = 1, J = 60;
        
        while (J >= 0) {
            System.out.println("I=" + I + " J=" + J);
            I += 3;
            J -= 5;
        }
    }
}
