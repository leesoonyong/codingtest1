package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class question14 {

    /**
     * 백준 2501번
     */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] numbers = br.readLine().split(" ");
        int n = Integer.parseInt(numbers[0]);
        int k = Integer.parseInt(numbers[1]);

        List<Integer> measure = new ArrayList<>();
        System.out.println("numbers = " + n);
        System.out.println("numbers = " + k);
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                measure.add(i);
            }
        }
        int result = measure.get(k - 1);
        System.out.println(result);

    }
}
