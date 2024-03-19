
package backjoon.그리디;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;


public class question40 {
    /**
     *백준 11399번 그리디 필수문제
     * https://www.acmicpc.net/workbook/view/12220
     * 그리디알고리즘
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A[] = new int[N];

        for(int i = 0; i < N; i++){
            A[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(A);

        int total = 0;
        int sum = 0;

        for(int i = 0; i < N; i++){
            sum += A[i];
            total += sum;
        }
        System.out.println(total);
    }
}
