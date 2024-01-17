package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class question16 {

    /**
     * 백준 2525번
     */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] numbers = br.readLine().split(" ");
        int hour = Integer.parseInt(numbers[0]);
        int minute = Integer.parseInt(numbers[1]);
        int plusMinute = Integer.parseInt(br.readLine());
        int hourPlusCount = (minute + plusMinute) / 60;

        if(hourPlusCount > 0) {
            for (int i = 1; i <= hourPlusCount; i++) {
                hour += 1;
                if(hour >= 24){
                    hour = 0;
                }
            }
            int plus = (minute + plusMinute) % 60;
            minute = 0;
            minute += plus;
        }else{
            minute += plusMinute;
        }

        System.out.println(hour + " " + minute);

    }
}
