package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class question13 {

    /**
     * 백준 2490번
     */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for(int i = 0; i < 3; i++){
            List<Integer> numberList = new ArrayList<>();
            String[] numbers = br.readLine().split(" ");
            for (String number : numbers) {
                numberList.add(Integer.parseInt(number));
            }

            int back = Collections.frequency(numberList, 0);
            if(back == 1){
                System.out.println("A");;
            }else if(back == 2){
                System.out.println("B");
            }else if(back == 3){
                System.out.println("C");
            }else if(back == 4){
                System.out.println("D");
            }else {
                System.out.println("E");
            }
        }
    }
}
