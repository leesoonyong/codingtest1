package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class question10 {

    /*백준 2010번
    첫째 줄에는 별 N개, 둘째 줄에는 별 N-1개, ..., N번째 줄에는 별 1개를 찍는 문제
    하지만, 오른쪽을 기준으로 정렬한 별(예제 참고)을 출력하시오.
    */


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String [] numbers = br.readLine().split(" ");

        int K = Integer.parseInt(numbers[0]);
        int L = Integer.parseInt(numbers[1]);

        int smallestFactor = findSmallestFactor(K);

        if(smallestFactor >= L){
            System.out.println("GOOD");
        }else{
            System.out.println("BAD");
            System.out.println(smallestFactor);
        }
        br.close();
    }

    public static int findSmallestFactor(int n) {
        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
               return i;
            }
        }
        return -1;
    }
}
