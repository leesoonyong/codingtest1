package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class question21 {
    public static void main(String[] args) throws IOException {


            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int N = Integer.parseInt(br.readLine());
            int sum = 0;
            int a = 1;
            for (int i = 0; i < N; i++) {
                sum += N - a;
                a++;
            }
            System.out.println(sum);

    }
}
