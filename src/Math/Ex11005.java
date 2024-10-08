package Math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Ex11005 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int N = Integer.parseInt(s[0]);
        int B = Integer.parseInt(s[1]);
        int M = 0;
        ArrayList<Integer> result = new ArrayList<>();
        while (N > 0){
            M = N % B;
            N /= B;
            result.add(M);
        }
        for (int i = result.size() - 1; i >= 0; i--) {
            if (result.get(i) == 10) {
                System.out.print("A");
            } else if (result.get(i) == 11) {
                System.out.print("B");
            } else if (result.get(i) == 12) {
                System.out.print("C");
            } else if (result.get(i) == 13) {
                System.out.print("D");
            } else if (result.get(i) == 14) {
                System.out.print("E");
            } else if (result.get(i) == 15) {
                System.out.print("F");
            } else if (result.get(i) == 16) {
                System.out.print("G");
            } else if (result.get(i) == 17) {
                System.out.print("H");
            } else if (result.get(i) == 18) {
                System.out.print("I");
            } else if (result.get(i) == 19) {
                System.out.print("J");
            } else if (result.get(i) == 20) {
                System.out.print("K");
            } else if (result.get(i) == 21) {
                System.out.print("L");
            } else if (result.get(i) == 22) {
                System.out.print("M");
            } else if (result.get(i) == 23) {
                System.out.print("N");
            } else if (result.get(i) == 24) {
                System.out.print("O");
            } else if (result.get(i) == 25) {
                System.out.print("P");
            } else if (result.get(i) == 26) {
                System.out.print("Q");
            } else if (result.get(i) == 27) {
                System.out.print("R");
            } else if (result.get(i) == 28) {
                System.out.print("S");
            } else if (result.get(i) == 29) {
                System.out.print("T");
            } else if (result.get(i) == 30) {
                System.out.print("U");
            } else if (result.get(i) == 31) {
                System.out.print("V");
            } else if (result.get(i) == 32) {
                System.out.print("W");
            } else if (result.get(i) == 33) {
                System.out.print("X");
            } else if (result.get(i) == 34) {
                System.out.print("Y");
            } else if (result.get(i) == 35) {
                System.out.print("Z");
            } else {
                System.out.print(result.get(i));
            }
        }
    }
}
