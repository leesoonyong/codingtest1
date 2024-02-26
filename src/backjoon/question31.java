
package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.Stack;
import java.util.StringTokenizer;


public class question31 {
    /**
     *백준 11286
     * 절대값 힙
     * 정렬문제
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> myQueue = new PriorityQueue<>((o1,o2) ->{


            //절대값 작은 데이터 먼우선
            int frist_abs = Math.abs(o1);
            int second_abs = Math.abs(o2);

            //절대값이 같은 경우 음수 우선
            if(frist_abs == second_abs){
                return o1 > o2 ? 1 : -1;
            }

            return frist_abs - second_abs;
        });

        for(int i = 0; i < N; i++){
            int request = Integer.parseInt(br.readLine());
            if(request == 0){
                if(myQueue.isEmpty()){
                    System.out.println("0");
                }else{
                    System.out.println(myQueue.poll());
                }
            }else{
                myQueue.add(request);
            }
        }


    }
}
