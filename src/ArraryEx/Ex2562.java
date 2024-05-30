package ArraryEx;

import java.io.*;

public class Ex2562 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[9];
        int max = arr[0];
        int maxNum = 0;
        for(int i = 0; i < 9; i++){
            arr[i] = Integer.parseInt(br.readLine().trim());
            if(arr[i] > max){
                max = arr[i];
                maxNum = i + 1;
            }
        }
        System.out.println(max);
        System.out.println(maxNum);
    }
}
