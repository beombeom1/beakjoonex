package Sort;

import java.util.Scanner;

public class Ex2750 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nn = new int[n];

        for(int i = 0; i < n; i++){
            int nnn = sc.nextInt();
            nn[i] = nnn;
        }
        int t = 0;
        for(int i = 0; i<n-1; i++){
            for(int j = 0; j<(n-1)-i; j++){
                if(nn[j] > nn[j+1]){
                    t = nn[j];
                    nn[j]=nn[j+1];
                    nn[j+1] = t;
                }
            }
        }
        for(int i = 0; i < n; i++){
            System.out.println(nn[i]);
        }
    }
}
