package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class question8 {

    /*백준 2010번
    선영이의 집에는 콘센트를 꽂을 수 있는 플러그가 하나밖에 없다. 선영이는 많은 컴퓨터를 가지고 있는데, 컴퓨터의 전원 문제는 어떻게 해결하는 것일까?

    하나의 플러그가 있고, N개의 멀티탭이 있다. 각 멀티탭은 몇 개의 플러그로 이루어져 있다고 한다. 최대 몇 대의 컴퓨터를 전원에 연결할 수 있을까?
    */


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        int answer = 0;

        for(int i = 0; i < count; i++){
            int number = Integer.parseInt(br.readLine());
            if(i == count - 1){
                answer += number;
            }else{
                answer += number - 1;
            }
        }

        System.out.println(answer);


        br.close(); // 모든 테스트 케이스 처리 후 BufferedReader를 닫음
    }
}
