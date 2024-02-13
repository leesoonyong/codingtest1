
package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class question25 {
    /**
     *백준 2075번
     * 투포인터
     * 시작쪽부터(0) 끝쪽은 마지막 인덱스부터 (n-1)
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        StringTokenizer st;


        int N = Integer.parseInt(br.readLine());
        for(int i = 0; i < N; i++){
            //각줄마다 숫자를 받음
            st =  new StringTokenizer(br.readLine());
            for(int j = 0; j < N; j++){
                //숫자를 하니씩 뽑아서 N번째 큰수(N개중의 제일 작은수가 N번째큰수가됨)
                int input = Integer.parseInt(st.nextToken());
                if(pq.size() < N){
                    pq.offer(input);
                }else{
                    if(pq.peek() < input){
                        pq.poll();
                        pq.offer(input);
                    }
                }
            }
        }

        System.out.println(pq.peek());


    }
}
