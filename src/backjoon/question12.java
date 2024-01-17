package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class question12 {

    /**
     * 백준 2476
     */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        int maxPrize = 0;

        for(int i = 0; i < count; i++){
            String[] numberString = br.readLine().split(" ");
            Map<Integer,Integer> duplicationMap = new HashMap<>();
            int maxNumber = 0;

            for (String number : numberString) {
                int num = Integer.parseInt(number);
                //이부분이 핵심 중복값찾기
                duplicationMap.put(num, duplicationMap.getOrDefault(num, 0) + 1);
                maxNumber = Math.max(maxNumber, num);
            }
            int prize = 0;

            for(Map.Entry<Integer,Integer> entry : duplicationMap.entrySet()){
               int key = entry.getKey();
               int value = entry.getValue();
               if(value == 3){
                   prize = 10000 + key * 1000;
               }else if(value== 2){
                   prize = 1000 + key * 100;
                   break;
               }
            }

            if(prize == 0){
                prize = maxNumber * 100;
            }

            maxPrize = Math.max(maxPrize, prize);
        }
        System.out.println(maxPrize);
    }
}
