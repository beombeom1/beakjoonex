package ArraryEx;

import java.io.*;

public class Ex10871 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int X = Integer.parseInt(input[1]);

        input = br.readLine().split(" ");
        int[] arr = new int[N];
        int count = 0;
        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(input[i]);
            if(arr[i]<X){
                bw.write(String.valueOf(arr[i]) + " ");
            }
        }

        bw.newLine();
        bw.flush();
        bw.close();
        br.close();

    }
}
