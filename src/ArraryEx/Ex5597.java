package ArraryEx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex5597 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[30];
        for (int i = 0; i < 30; i++){
            arr[i] = i + 1;
        }
        for (int i = 0; i < 28; i++){
            int X = Integer.parseInt(br.readLine());
            arr[X - 1] = 0;
        }
        for (int i = 0; i<30; i++){
            if(arr[i]!=0){
                System.out.println(arr[i]);
            }
        }
    }
}
