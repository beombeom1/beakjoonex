package Ex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex4714 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            double n = Double.parseDouble(br.readLine());
            if(n<0) {
                break;
            }
            System.out.printf("Objects weighing %.2f on Earth will weigh %.2f on the moon.%n", n, n * 0.167);
        }
    }
}
