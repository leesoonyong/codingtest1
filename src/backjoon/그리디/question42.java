
package backjoon.그리디;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class question42 {
    /**
     *백준 1541번 그리디 필수문제
     * https://www.acmicpc.net/workbook/view/12220
     * 그리디알고리즘
     * 참고 사이트 : https://st-lab.tistory.com/148
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sum = Integer.MAX_VALUE;
        StringTokenizer st = new StringTokenizer(br.readLine(), "-");
        while(st.hasMoreTokens()){
            int temp = 0;
            StringTokenizer addition = new StringTokenizer(st.nextToken(), "+");

            while(addition.hasMoreTokens()){
                temp += Integer.parseInt(addition.nextToken());
            }

            if(sum == Integer.MAX_VALUE){
                sum = temp;
            }else{
                sum -= temp;
            }
        }
        System.out.println(sum);
    }
}
