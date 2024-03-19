
package backjoon.그리디;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class question36 {
    /**
     *백준 5585번 그리디 필수문제
     * https://www.acmicpc.net/workbook/view/12220
     * 그리디알고리즘
     */
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int route = Integer.parseInt(br.readLine());

        String[] length = br.readLine().split(" ");
        String[] oil = br.readLine().split(" ");

        int[] lengthArr = Arrays.stream(length).mapToInt(Integer::parseInt).toArray();
        int[] oilArr = Arrays.stream(oil).mapToInt(Integer::parseInt).toArray();

        int totalCost = 0;
        int minPrice  = oilArr[0]; //주유소 최저가격

        for(int i = 0; i < route - 1; i++){
            if(oilArr[i] < minPrice){ //비교
                minPrice = oilArr[i]; //재설정
            }
            totalCost += minPrice * lengthArr[i];
        }

        System.out.println(totalCost);
    }

}
