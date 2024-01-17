package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class question15 {

    /**
     * 백준 2501번
     */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        String[] numbers = br.readLine().split(" ");
        int sum = 0;
        int result = 0;
        for (String stringNumber : numbers) {
            int number = Integer.parseInt(stringNumber);
            if(number != 0){
                sum += number;
                result += sum;
            }else{
                sum = 0;
            }
        }
        System.out.println(result);
    }
}
