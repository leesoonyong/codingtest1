
package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class question24 {
    /**
     *백준 1940번
     * 투포인터
     * 시작쪽부터(0) 끝쪽은 마지막 인덱스부터 (n-1)
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());

        int start_index = 0;
        int end_index = N - 1;
        int count = 0;

        int [] arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        //min -> max
        Arrays.sort(arr);

        while(start_index < end_index){
            if(arr[start_index] + arr[end_index] < M){
                start_index++;
            }else if(arr[start_index] + arr[end_index] > M){
                end_index --;
            }else if(arr[start_index] + arr[end_index] == M){
                count++;
                start_index++;
                end_index --;
            }
        }

        System.out.println(count);
    }
}
