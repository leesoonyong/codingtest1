package leetcode.hashtable;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class question3 {
    /*1365. How Many Numbers Are Smaller Than the Current Number*/
    public static int[] question33(int[]args) {
        int[] result = new int[args.length]; // 각 요소에 대한 결과를 저장할 배열
        for (int i = 0; i < args.length; i++) {
            int count = 0; // 각 요소에 대해 카운트를 0으로 초기화
            for (int j = 0; j < args.length; j++) {
                if (i != j && args[j] < args[i]) { // i와 j가 다르며 args[j]가 args[i]보다 작은 경우
                    count++;
                }
            }
            result[i] = count; // 결과 배열에 카운트 저장
        }
        return result;
    }

    public static void main(String[] args) {
        int [] aa = {8,1,2,2,3};
        System.out.println(Arrays.toString(question33(aa)));
    }

}
