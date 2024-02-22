
package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class question29 {
    /**
     *백준 2164
     * queue큐 문제
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 1; i <= N; i++) {
            queue.add(i);
        }
        int size = queue.size();
        while (size-- > 1) {
            queue.poll(); // 제일 위의 카드를 바닥에 버림
            queue.add(queue.poll()); // 그 다음 카드를 제일 아래로 옮김
        }

        System.out.println(queue.poll());
    }
}
