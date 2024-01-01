package leetcode.hashtable;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

public class question2 {

    public static void numJewelsInStones(String jewels, String stones) {
        Map<Character,Integer> jewelMap = new HashMap<>();

        for (char jewel : jewels.toCharArray()) {
            jewelMap.put(jewel,0);
        }

        for(char stone : stones.toCharArray()){
            if(jewelMap.containsKey(stone)){
                jewelMap.put(stone, jewelMap.get(stone) + 1);
            }
        }

        int sum = 0;
        for (int value : jewelMap.values()) {
            sum += value;
        }
        System.out.println("The sum of all values: " + sum);
    }

    public static void main(String[] args) {
        numJewelsInStones("z","ZZ");
    }
}
