package Deepen1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex3003 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] A = br.readLine().split(" ");
        int[] B = new int[6];
        for (int i = 0; i < 6; i++){
            B[i] = Integer.parseInt(A[i]);
        }
        int[] C = {1, 1, 2, 2, 2, 8};
        for (int i = 0; i < 6; i++){
            System.out.print(C[i] - B[i] + " ");
        }
    }
}
