package ArraryEx;

import java.io.*;

public class Ex10818 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");

        int[] arr = new int[N];
        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(input[i]);
        }

        int max = arr[0];
        int min = arr[0];

        for(int i = 1; i < N; i++){
            arr[i] = Integer.parseInt(input[i]);
            if(arr[i] > max){
                max = arr[i];
            }
            if(arr[i] < min){
                min = arr[i];
            }
        }
        bw.write(min +" "+ max);
        bw.flush();
        bw.close();
        br.close();
    }
}