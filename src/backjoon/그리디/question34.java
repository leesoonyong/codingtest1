
package backjoon.그리디;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;


public class question34 {
    /**
     *백준 18185 그리디 필수문제
     * https://www.acmicpc.net/workbook/view/12220
     * 그리디알고리즘
     */
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        //피로도
        int A = Integer.parseInt(st.nextToken());
        //일의양
        int B = Integer.parseInt(st.nextToken());
        //쉰시간만큼의 피로도가 까지는것
        int C = Integer.parseInt(st.nextToken());
        //피로도의 상한선
        int M = Integer.parseInt(st.nextToken());
        //하루의 시간
        int hour = 24;

        int pirodo = 0; // 현재피로도
        int result = 0;//최종 일의양

        //하루동안은 24번의 결정을 할수가있음
        for(int i = 0; i < 24; i++){
            //번아웃체크 피로도는 절대 상한선을 넘으면안되므로 사전에 체크
            if(pirodo + A > M){
                //최대상한선을 넘으면 A는 무조건 쉬어야함
                pirodo = pirodo - C;
                if(pirodo < 0){
                    pirodo = 0;
                }
                //해당과정을 math.Max로 바꿀수있음
                //여기서 Math.max 함수는 두 인자 중에서 더 큰 값을 반환합니다.
                // 이 코드의 경우, pirodo - C 0 중에서 더 큰 값을
                // pirodo 할당합니다. 즉, 휴식을 취함으로써 피로도를 줄이되,
                // 피로도가 0보다 작아질 경우에는 0을 반환하여 피로도가 음수가 되는 것을 방지합니다.
                pirodo = Math.max(0, pirodo - C);
            }else{
                //피로도가 안넘으면 일하고 피로도채우기
                pirodo += A;
                result += B;
            }
        }
        System.out.println(result);
    }
}
