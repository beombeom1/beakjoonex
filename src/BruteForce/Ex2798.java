package BruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex2798 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s1 = br.readLine().split(" ");
        int n1 = Integer.parseInt(s1[0]);
        int n2 = Integer.parseInt(s1[1]);
        String[] s2 = br.readLine().split(" ");
        int[] nn = new int[n1];
        for(int i = 0; i< n1; i++){
            nn[i] = Integer.parseInt(s2[i]);
        }
        int r = 0;
        for(int i = 0; i <n1; i++){
            for(int j = 1; j <n1; j++){
                for(int k = 2; k <n1; k++){
                    if(i>=j){
                        continue;
                    }
                    if(i>=k){
                        continue;
                    }
                    if(j>=k){
                        continue;
                    }
                    if(nn[i] + nn[j] + nn[k]<=n2 && nn[i] + nn[j] + nn[k]>r){
                        r = nn[i] + nn[j] + nn[k];
                    }
                }
            }
        }
        System.out.println(r);
    }
}
