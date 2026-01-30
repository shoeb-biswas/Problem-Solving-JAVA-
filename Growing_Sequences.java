import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            int X = Integer.parseInt(br.readLine().trim());
            if (X == 0) {
                break;
            }

            StringBuilder sb = new StringBuilder();
            for (int i = 1; i <= X; i++) {
                if (i > 1) {
                    sb.append(" ");
                }
                sb.append(i);
            }
            System.out.println(sb);
        }
    }
}
