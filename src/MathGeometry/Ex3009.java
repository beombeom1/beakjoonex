package MathGeometry;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Ex3009 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] st1 = br.readLine().split(" ");
        String[] st2 = br.readLine().split(" ");
        String[] st3 = br.readLine().split(" ");
        int[] aa = new int[6];
        aa[0] = Integer.parseInt(st1[0]);
        aa[3] = Integer.parseInt(st1[1]);
        aa[1] = Integer.parseInt(st2[0]);
        aa[4] = Integer.parseInt(st2[1]);
        aa[2] = Integer.parseInt(st3[0]);
        aa[5] = Integer.parseInt(st3[1]);
        ArrayList<Integer> nemo1 = new ArrayList<>();
        nemo1.add(aa[0]);
        nemo1.add(aa[1]);
        nemo1.add(aa[2]);

        nemo1.add(aa[3]);
        nemo1.add(aa[4]);
        nemo1.add(aa[5]);

        if(!nemo1.get(0).equals(nemo1.get(1)) && !nemo1.get(0).equals(nemo1.get(2))){
            System.out.print(nemo1.get(0) + " ");
        } else if (!nemo1.get(1).equals(nemo1.get(0)) && !nemo1.get(1).equals(nemo1.get(2))) {
            System.out.print(nemo1.get(1) + " ");
        }else {
            System.out.print(nemo1.get(2) + " ");
        }

        if(!nemo1.get(3).equals(nemo1.get(4)) && !nemo1.get(3).equals(nemo1.get(5))){
            System.out.print(nemo1.get(3));
        } else if (!nemo1.get(4).equals(nemo1.get(3)) && !nemo1.get(4).equals(nemo1.get(5))) {
            System.out.print(nemo1.get(4));
        }else {
            System.out.print(nemo1.get(5));
        }
    }
}
