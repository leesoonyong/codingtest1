
package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;


public class question33 {
    /**
     *백준 2580
     *
     * 정렬문제
     */
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String number = br.readLine();
        char[] charArray = number.toCharArray();

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i = 0;  i < charArray.length; i++){
            pq.add(Integer.parseInt(String.valueOf(charArray[i])));
        }

        StringBuilder sb = new StringBuilder();

        while (!pq.isEmpty()){
            sb.append(pq.poll());
        }
        System.out.print(sb.toString());

    }
}
