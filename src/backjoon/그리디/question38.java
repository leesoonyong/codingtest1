
package backjoon.그리디;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.IntStream;


public class question38 {
    /**
     *백준 5585번 그리디 필수문제
     * https://www.acmicpc.net/workbook/view/12220
     * 그리디알고리즘
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        while(T-- > 0) {

            int N = Integer.parseInt(br.readLine());
            String[] input = br.readLine().split(" ");
            int[] intArray = Arrays.stream(input)
                    .mapToInt(Integer::parseInt)
                    .toArray();
            //주식에서 가장높은값
            int maxValue = 0;
            //총이익
            int result = 0;
            //현재 주식의값을 미리넣는다
            for (int i = intArray.length - 1; i >= 0; i--) {
                if (intArray[i] > maxValue) {
                    // 현재 주식 가격이 현재까지의 최대 가격보다 크면, 최대 가격 업데이트
                    maxValue = intArray[i];
                } else {
                    // 현재 주식 가격이 최대 가격보다 낮으면, 이익 계산 및 총 이익에 추가
                    result += maxValue - intArray[i];
                }
            }
            System.out.println(result);
        }
    }

}
