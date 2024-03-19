
package backjoon.그리디;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;


public class question37 {
    /**
     *백준 5585번 그리디 필수문제
     * https://www.acmicpc.net/workbook/view/12220
     * 그리디알고리즘
     */
    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        while(T-- > 0){

            int N = Integer.parseInt(br.readLine());
            int[][] scores = new int[N][2];
            for(int i = 0; i < N; i++){
                String[] input = br.readLine().split(" "); // 서류심사 성적과 면접 성적을 공백으로 구분하여 입력받음
                scores[i][0] =  Integer.parseInt(input[0]);
                scores[i][1] =  Integer.parseInt(input[1]);
            }

            Arrays.sort(scores, Comparator.comparingInt(a -> a[0]));
            int count = 1; // 첫 번째 지원자는 항상 합격
            int bestInterviewRank = scores[0][1]; //첫번째 지원자의 면접을기준

            for(int i = 1; i < scores.length; i++){
                if(scores[i][1] < bestInterviewRank){
                    count++;
                    bestInterviewRank = scores[i][1];
                }
            }
            System.out.println(count);
        }
    }

}
