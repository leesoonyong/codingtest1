
package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class question26 {
    /**
     *백준 2003번
     * 투포인터
     * 시작쪽부터(0) 끝쪽은 마지막 인덱스부터 (n-1)
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int count = 0;
        int start_index = 0;
        int end_index = 0;

        st = new StringTokenizer(br.readLine());
        int[]arr = new int[N];

        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int sum = 0;

        while(true){
            if(sum < M){
                sum = sum + arr[end_index++];
            }else if(end_index == N){
                break;
            }else{
                sum = sum - arr[start_index];
                start_index++;
            }

            if(sum == M){
                count++;
            }
        }
        System.out.println(count);




    }
}
