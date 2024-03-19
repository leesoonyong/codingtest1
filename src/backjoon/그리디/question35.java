
package backjoon.그리디;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class question35 {
    /**
     *백준 5585번 그리디 필수문제
     * https://www.acmicpc.net/workbook/view/12220
     * 그리디알고리즘
     */
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int money = 1000 - Integer.parseInt(br.readLine());
        int result = 0;

        while(money > 0){
            if(money >= 500){
                result += money / 500;
                money = money % 500;
            }else if(money >= 100){
                result += money / 100;
                money = money % 100;
            }else if(money >= 10){
                result += money / 10;
                money = money % 10;
            }else if(money >= 5){
                result += money / 5;
                money = money % 5;
            }else if(money >= 1){
                result += money / 1;
                money = money % 1;
            }
        }

        System.out.println(result);

        //두번째 풀이법은 해당 코인을 배열에 넣어서 해결하기
        int money2 = 1000 - Integer.parseInt(br.readLine());
        int[]coins = {500, 100, 50, 10, 5, 1};
        for(int coin : coins){
            result += money2 / coin; // 해당 동전으로 나누어 몇 개를 사용할 수 있는지 계산
            money2 %= coin; // 나머지 금액을 업데이트
        }

    }

}
