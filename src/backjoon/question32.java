
package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;


public class question32 {
    /**
     *백준 2580
     *
     * 정렬문제
     */
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int i = 0; i < N; i++){
            pq.add(Integer.parseInt(br.readLine()));
        }

        StringBuilder sb = new StringBuilder();

        while(!pq.isEmpty()){
            sb.append(pq.poll()).append("\n");
        }

        System.out.println(sb.toString());
    }
}
