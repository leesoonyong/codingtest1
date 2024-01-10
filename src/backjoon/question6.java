package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class question6 {

    /*백준 1547번
    세준이는 컵 3개를 탁자 위에 일렬로 엎어놓았다. 컵의 번호는 맨 왼쪽 컵부터 순서대로 1번, 2번 3번이고, 세준이는 이 컵을 이용해서 게임을 하려고 한다.

    먼저 1번 컵의 아래에 공을 하나 넣는다. 세준이는 두 컵을 고른 다음, 그 위치를 맞바꾸려고 한다. 예를 들어, 고른 컵이 1번과 2번이라면, 1번 컵이 있던 위치에 2번 컵을 이동시키고, 동시에 2번 컵이 있던 위치에 1번 컵을 이동시켜야 한다. 이때 공은 움직이지 않기 때문에, 공의 위치는 맨 처음 1번 컵이 있던 위치와 같다.

    세준이는 컵의 위치를 총 M번 바꿀 것이며, 컵의 위치를 바꾼 방법이 입력으로 주어진다. 위치를 M번 바꾼 이후에 공이 들어있는 컵의 번호를 구하는 프로그램을 작성하시오.

    입력
    첫째 줄에 컵의 위치를 바꾼 횟수 M이 주어지며, M은 50보다 작거나 같은 자연수이다. 둘째 줄부터 M개의 줄에는 컵의 위치를 바꾼 방법 X와 Y가 주어지며, X번 컵과 Y번 컵의 위치를 서로 바꾸는 것을 의미한다. X와 Y의 값은 3보다 작거나 같고, X와 Y가 같을 수도 있다.

    컵을 이동시킨 후에 공이 컵 바깥에 있는 경우는 없다.

    출력
    첫째 줄에 공이 들어있는 컵의 번호를 출력한다. 공이 사라져서 컵 밑에 없는 경우에는 -1을 출력한다.
    */


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        int answer = 0;
        List<Integer> cups = new ArrayList<>();
        cups.add(1);
        cups.add(0);
        cups.add(0);
        for(int i = 0; i < count; i++){
            List<Integer> numbers = new ArrayList<>();
            String [] positionChange = br.readLine().split(" ");
            int X = Integer.parseInt(positionChange[0]) - 1; // 인덱스는 0부터 시작
            int Y = Integer.parseInt(positionChange[1]) - 1;

            // 컵의 위치를 바꿈
            int temp = cups.get(X);
            cups.set(X, cups.get(Y));
            cups.set(Y, temp);
        }

        for(int i = 0; i < 3; i++){
            if(cups.get(i) == 1){
                System.out.println(i + 1);
                break;
            }
        }

        br.close(); // 모든 테스트 케이스 처리 후 BufferedReader를 닫음
    }
}
