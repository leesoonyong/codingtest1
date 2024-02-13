package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class question18 {

    /**
     * 백준 2525번
     */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(br.readLine());

        for(int i = 0; i < count; i++){
            int sum = 0;
            int people = 0;
            String number = br.readLine();
            if(number.isBlank()){
                sum = 0;
            }else if(!number.isBlank() && sum == 0){
                people = Integer.parseInt(number);
            }
            sum += Integer.parseInt(number);
            if(sum % people == 0){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }



    }
}
