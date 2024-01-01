import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {9, 1, 5, 3, 6, 2};
        int n = numbers.length;
        List<Integer> result = new ArrayList<>();


        for (int i = 0; i < n; i++) {
            int a = numbers[i];
            boolean found = false;
            for(int j = i + 1; j < n ; j ++){
                int b = numbers[j];
                if(a < b){
                    result.add(b);
                    found = true;
                    break;
                }
            }
            if (!found) {
                result.add(-1);
            }
        }

        result.forEach(System.out::println);
    }
}