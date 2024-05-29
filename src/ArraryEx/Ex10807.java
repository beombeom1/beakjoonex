package ArraryEx;

import java.io.*;

public class Ex10807 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");
        int[] arr = new int[N];
        int v = Integer.parseInt(br.readLine());
        int count = 0;

        for (int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(input[i]);
            if (arr[i] == v) {
                count += 1;
            }
        }
        bw.write(String.valueOf(count));
        bw.newLine();
        bw.flush();
        bw.close();
        br.close();
    }
}