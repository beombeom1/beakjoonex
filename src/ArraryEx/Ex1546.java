package ArraryEx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex1546 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        String[] inputArray = br.readLine().split(" ");
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(inputArray[i]);
        }
        int M = 0;
        for (int i = 0; i < N; i++){
            if(arr[i] > M){
                M = arr[i];
            }
        }
        double total = 0;

        for (int i = 0; i < N; i++){
            total += (double)arr[i] / M * 100;
        }
        double avg = total / N;
        System.out.println(avg);
    }
}
