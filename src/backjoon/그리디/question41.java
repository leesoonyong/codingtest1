
package backjoon.그리디;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;


public class question41 {
    /**
     *백준 11047번 그리디 필수문제
     * https://www.acmicpc.net/workbook/view/12220
     * 그리디알고리즘
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        Integer [] arr = new Integer[N];
        int result = 0;

        //할당
        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        //내림차순정렬안해도 오름차순으로 정렬되있으면 배열 반대로돌리기
        for(int i = N - 1; i >= 0; i--){
            if(arr[i] <= K){
                result += K / arr[i];
                K %= arr[i];
            }
        }
        System.out.println(result);
    }
}
