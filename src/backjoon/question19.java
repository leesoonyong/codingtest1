package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class question19 {

    /**
     * 백준 2525번
     */

    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        /*첫번째 풀이*/
//        int count = Integer.parseInt(br.readLine());
        /*
        double number = 0;
        double sum = 0;
        double pound = 2.2046;
        double kg = 0.4536;
        double gallon = 0.2642;
        double liter = 3.7854;
        String unit = "";


        for(int i = 0; i < count; i++){
            String[] numbers = br.readLine().split(" ");
            number = Double.parseDouble(numbers[0]);
            unit = numbers[1];

            if(unit.equals("kg")){
                sum = (number * pound);
                System.out.println(String.format("%.4f lb", sum));
            } else if (unit.equals("l")) {
                sum = (number * gallon);
                System.out.println(String.format("%.4f g", sum));
            } else if(unit.equals("lb")){
                sum = (number * kg);
                System.out.println(String.format("%.4f kg", sum));
            } else if(unit.equals("g")){
                sum = (number * liter);
                System.out.println(String.format("%.4f l", sum));
            }
        }

         */

        /*두번째 풀이*/

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int count = Integer.parseInt(br.readLine());

            Map<String, String> unitMap = new HashMap<>();
            unitMap.put("kg", "lb 2.2046");
            unitMap.put("l", "gal 0.2642");
            unitMap.put("lb", "kg 0.4536");
            unitMap.put("gal", "l 3.7854");

            for (int i = 0; i < count; i++) {
                String[] input = br.readLine().split(" ");
                double number = Double.parseDouble(input[0]);
                String unit = input[1];

                if (unitMap.containsKey(unit)) {
                    String[] conversion = unitMap.get(unit).split(" ");
                    double convertedNumber = number * Double.parseDouble(conversion[1]);
                    printFormattedResult(i + 1, convertedNumber, conversion[0]);
                }
            }
        }

        private static void printFormattedResult(int caseNum, double number, String unit) {
            System.out.printf("%d %.4f %s\n", caseNum, number, unit);
    }
}
