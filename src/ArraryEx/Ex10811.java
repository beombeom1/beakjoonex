package ArraryEx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex10811 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);
        int[] arr = new int[N];
        for(int i = 0; i < N; i++){
            arr[i] = i + 1;
        }
        for (int i = 0; i < M; i++) {
            String[] input2 = br.readLine().split(" ");
            int A = Integer.parseInt(input2[0]) - 1;
            int B = Integer.parseInt(input2[1]) - 1;

            while (A < B) {
                int C = arr[A];
                arr[A] = arr[B];
                arr[B] = C;
                A++;
                B--;
            }
        }
        for(int i = 0; i < N; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
