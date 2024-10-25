package Sort;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Ex2751 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        ArrayList<Integer> sss = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            sss.add(Integer.parseInt(br.readLine()));
        }

        Collections.sort(sss);

        for (int i = 0; i < sss.size(); i++) {
            bw.write(sss.get(i) + "\n");
        }

        bw.flush();
        bw.close();
    }
}
