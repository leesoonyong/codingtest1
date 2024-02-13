package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class question23 {
    /**
     *백준 2018번
     *투포인터
     * 시작값과 끝값이 같은인덱스에서 출발
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int result = Integer.parseInt(st.nextToken());
        int count = 0;
        int start_index = 0;
        int end_index = 0;


        int []arr = new int[n];
        //범위를 배열에넣자
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int sum = 0;

        while(true){
            if(sum > result){
                sum = sum - arr[start_index++];
            }else if(end_index >= arr.length){
                break;
            }else{
                sum = sum + arr[end_index++];
            }
            if(sum == result){
                count++;
            }
        }
        System.out.println(count);
    }
}
