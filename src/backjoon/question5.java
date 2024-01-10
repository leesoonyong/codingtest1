package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class question5 {

    /*백준 1284번
    재석이는 대문에 붙이는 (주소를 나타내는) 호수판 제작업체의 직원이다. 고객에게 전달할 호수판은 숫자와 숫자 사이 그리고 왼쪽 오른쪽으로 적당히 여백이 들어가 줘야하고 숫자마다 차지하는 간격이 조금씩 상이하다. 다행이도 규칙은 매우 간단하다.

    각 숫자 사이에는 1cm의 여백이 들어가야한다.
    1은 2cm의 너비를 차지해야한다. 0은 4cm의 너비를 차지해야한다. 나머지 숫자는 모두 3cm의 너비를 차지한다.
    호수판의 경계와 숫자 사이에는 1cm의 여백이 들어가야한다.
    120.png

    예를 들어 위의 120 같은 경우,  각 숫자 사이에 여백이 1cm 씩 2개 들어간다. 1은 2cm, 2는 3cm, 0은 4cm를 차지한다. 오른쪽, 왼쪽 경계에서 각각 여백이 1cm씩 차지한다. 따라서 총 2 + 2 + 3 + 4 + 1 + 1 = 13(cm) 가 된다.

    재석이는 고객에게 전달해야할 호수판의 너비가 얼마나 되는지 궁금해졌다. 재석이를 도와주자!
    */


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String number = br.readLine();

            if (number.equals("0")) {
                break;
            }

            int answer = 2; // 기본적으로 앞뒤 공간 1/1 해서 2
            List<Integer> numbers = new ArrayList<>();

            for (char num : number.toCharArray()) {
                numbers.add(Integer.parseInt(String.valueOf(num)));
            }

            for (Integer num : numbers) {
                if (num == 0) {
                    answer += 4;
                } else if (num == 1) {
                    answer += 2;
                } else {
                    answer += 3;
                }
            }

            answer += numbers.size() - 1;

            System.out.println(answer);
        }

        br.close(); // 모든 테스트 케이스 처리 후 BufferedReader를 닫음
    }
}
