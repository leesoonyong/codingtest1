
package backjoon.그리디;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;


public class question39 {
    /**
     *백준 5585번 그리디 필수문제
     * https://www.acmicpc.net/workbook/view/12220
     * 그리디알고리즘
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] A = new int[N];
        int[] B = new int[N];

        for(int i = 0; i < N; i++){
            A[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());

        for(int i = 0; i < N; i++){
            B[i] = Integer.parseInt(st.nextToken());
        }

        Integer[] BIndex = new Integer[B.length];

        for(int i = 0; i < B.length; i++){
            BIndex[i] = i;
        }

        Arrays.sort(A);
        //인덱스를 찾기 B의 최대값을정렬해서
        Arrays.sort(BIndex, (i,j) -> B[j] - B[i]);


        int S = 0;

        for(int i = 0; i < N; i++){
            S += A[i] * B[BIndex[i]];
        }

        System.out.println(S);

    }
}
