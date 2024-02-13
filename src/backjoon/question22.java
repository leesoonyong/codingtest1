package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class question22 {
    /**
     *백준 2018번
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = 15;
        int count = 1;
        int start_index = 1;
        int end_index = 1;
        int sum = 1;

        while(end_index != n){
            if(sum == n){
                count++; end_index++;  sum = sum + end_index;
            } else if (sum > n) {
                sum = sum - start_index;
                start_index++;
            } else{
                end_index++;  sum = sum + end_index;
            }
        }
        System.out.println(count);


    }
}
