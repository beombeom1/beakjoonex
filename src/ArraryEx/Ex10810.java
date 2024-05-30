package ArraryEx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex10810 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);

        int[] arr = new int[N];
        for (int i = 0; i < N; i++){
            arr[i] = 0;
        }

        for(int j = 0; j < M; j++){
            String[] input2 = br.readLine().split(" ");
            int A = Integer.parseInt(input2[0]);
            int B = Integer.parseInt(input2[1]);
            int C = Integer.parseInt(input2[2]);

            for (int k = A - 1; k <= B - 1; k++) {
                arr[k] = C;
            }
        }
        for (int i = 0; i < N; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
