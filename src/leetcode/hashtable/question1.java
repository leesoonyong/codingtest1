package leetcode.hashtable;

import java.util.HashMap;
import java.util.Map;

public class question1 {

    public static int numIdenticalPairs(int[] nums) {
        Map<Integer, Integer> countMap = new HashMap<>();
        int count = 0;
        for(int num : nums){
            if(countMap.containsKey(num)){
                count += countMap.get(num);
                countMap.put(num, countMap.get(num) + 1);
            }else{
                countMap.put(num, 1);
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1, 1, 3};
        System.out.println("Number of good pairs: " + numIdenticalPairs(nums));
    }
}
