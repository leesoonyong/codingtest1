package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class question2 {

    /*백준 1247번
    N개의 정수가 주어지면, 이 정수들의 합 S의 부호를 구하는 프로그램을 작성하시오.
    */

    public static List<String> answer () throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<String> answers = new ArrayList<>();

        for (int t = 0; t < 3; t++) {

            int number = Integer.parseInt(br.readLine());
            long sum = 0;
            for (int i = 0; i < number; i++) {
                long value = Long.parseLong(br.readLine()); // 입력받은 값을 long으로 파싱
                sum += value; // 합계에 더함
            }

            if (sum == 0) {
                answers.add("0");
            } else if (sum > 0) {
                answers.add("+");
            } else {
                answers.add("-");
            }
        }

        br.close(); // 모든 테스트 케이스 처리 후 BufferedReader를 닫음
        return answers;
    }

    public static void main(String[] args) throws IOException {
        System.out.println(answer());
    }
}
