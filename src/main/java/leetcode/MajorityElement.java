package leetcode;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static void main(String[] args) {
        int[] nums = {3,2,3};
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }
        int maxValue = Integer.MIN_VALUE;
        for(Map.Entry<Integer,Integer> entry : map.entrySet()) {
            if(entry.getKey() > maxValue) {
                maxValue = entry.getKey();
            }
        }
        for(Map.Entry<Integer,Integer> entry : map.entrySet()) {
            if(entry.getKey() == maxValue) {
                if(entry.getValue() > nums.length/2) {
                    System.out.println(entry.getKey());
                }

            }
        }
    }
}
