package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class question1 {

    /*백준 1085
    한수는 지금 (x, y)에 있다.
    직사각형은 각 변이 좌표축에 평행하고,
    왼쪽 아래 꼭짓점은 (0, 0), 오른쪽 위 꼭짓점은 (w, h)에 있다.
    직사각형의 경계선까지 가는 거리의 최솟값을 구하는 프로그램을 작성하시오.
    */

    public static int answer () throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        String[] numbers = line.split(" ");

        int x = Integer.parseInt(numbers[0]);
        int y = Integer.parseInt(numbers[1]);
        int w = Integer.parseInt(numbers[2]);
        int h = Integer.parseInt(numbers[3]);
        br.close();

        int wx = w-x;
        int hy = h-y;

        return Math.min(Math.min(x, y), Math.min(wx,hy));
    }

    public static void main(String[] args) throws IOException {
        int answer = answer();
        System.out.println(answer);
    }
}
