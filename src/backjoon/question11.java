package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class question11 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int ride = 0;
        int down = 0;
        int currentPassengers = 0;
        int maxPassengers = 0;

        for(int i = 0; i < 10; i++) {
            String[] numbers = br.readLine().split(" ");
            down  = Integer.parseInt(numbers[0]);
            ride  = Integer.parseInt(numbers[1]);

            currentPassengers = currentPassengers - down + ride;
            if (currentPassengers > maxPassengers) {
                maxPassengers = currentPassengers;
            }
        }
        System.out.println(maxPassengers);
    }
}
