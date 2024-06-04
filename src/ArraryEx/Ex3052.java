package ArraryEx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex3052 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[10];
        for(int i = 0; i < 10; i++){
            arr[i] = Integer.parseInt(br.readLine().trim());
        }
        int[] arr2 = new int[10];
        for(int i = 0; i < 10; i++){
            arr2[i] = arr[i] % 42;
        }
        for(int i = 0; i < 10; i++){
            for (int j = 0; j < 10; j++){
                if(arr2[i]==arr2[j] && i!=j){
                    arr2[i] = 50;
                }
            }
        }
        int count = 0;
        for(int i = 0; i < 10; i++){
            if(arr2[i] == 50){
                count += 1;
            }
        }
        System.out.println(10 - count);
    }
}
