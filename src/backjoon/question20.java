package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class question20 {

    /**
     * 백준 2525번
     */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        double quarter = 0.25;
        double dime = 0.10;
        double nickel = 0.05;
        double penny = 0.01;

        double[] coinValues = {0.25, 0.10, 0.05, 0.01};//큰순서정렬

        for(int i = 0; i < count; i++){
            int money = Integer.parseInt(br.readLine());
            double convertedNumber = money / 100.0;

            List<Integer> coinCounts = new ArrayList<>();

            for (double coinValue : coinValues) {
                int coinCount = (int) (convertedNumber / coinValue);
                convertedNumber -= coinCount * coinValue;
                coinCounts.add(coinCount);
            }



        }



    }
}
