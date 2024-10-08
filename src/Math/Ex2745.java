package Math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex2745 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(" ");
        int B = Integer.parseInt(arr[1]);
        String[] arr2 = arr[0].split("");
        int[] arr3 = new int[arr2.length];

        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i].equals("A")) {
                arr3[i] = 10;
            } else if (arr2[i].equals("B")) {
                arr3[i] = 11;
            } else if (arr2[i].equals("C")) {
                arr3[i] = 12;
            } else if (arr2[i].equals("D")) {
                arr3[i] = 13;
            } else if (arr2[i].equals("E")) {
                arr3[i] = 14;
            } else if (arr2[i].equals("F")) {
                arr3[i] = 15;
            } else if (arr2[i].equals("G")) {
                arr3[i] = 16;
            } else if (arr2[i].equals("H")) {
                arr3[i] = 17;
            } else if (arr2[i].equals("I")) {
                arr3[i] = 18;
            } else if (arr2[i].equals("J")) {
                arr3[i] = 19;
            } else if (arr2[i].equals("K")) {
                arr3[i] = 20;
            } else if (arr2[i].equals("L")) {
                arr3[i] = 21;
            } else if (arr2[i].equals("M")) {
                arr3[i] = 22;
            } else if (arr2[i].equals("N")) {
                arr3[i] = 23;
            } else if (arr2[i].equals("O")) {
                arr3[i] = 24;
            } else if (arr2[i].equals("P")) {
                arr3[i] = 25;
            } else if (arr2[i].equals("Q")) {
                arr3[i] = 26;
            } else if (arr2[i].equals("R")) {
                arr3[i] = 27;
            } else if (arr2[i].equals("S")) {
                arr3[i] = 28;
            } else if (arr2[i].equals("T")) {
                arr3[i] = 29;
            } else if (arr2[i].equals("U")) {
                arr3[i] = 30;
            } else if (arr2[i].equals("V")) {
                arr3[i] = 31;
            } else if (arr2[i].equals("W")) {
                arr3[i] = 32;
            } else if (arr2[i].equals("X")) {
                arr3[i] = 33;
            } else if (arr2[i].equals("Y")) {
                arr3[i] = 34;
            } else if (arr2[i].equals("Z")) {
                arr3[i] = 35;
            }else {
                arr3[i] = Integer.parseInt(arr2[i]);
            }
        }
        int result = 0;
        for (int i = 0; i < arr3.length; i++) {
            result = result * B + arr3[i];
        }
        System.out.println(result);
    }

}
