package leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class DisappearedNumbers {
    public static void main(String[] args) {
            int[] nums = {1,1};
            System.out.println(findDisappearedNumbers(nums)); // Output: [5, 6]
        }

    private static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> disappearedNumbers = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();

        for(int num : nums) {
            set.add(num);
        }
        System.out.println(set);
        for(int i=1; i<=nums.length; i++) {
            if(!set.contains(i)) {
                disappearedNumbers.add(i);
            }
        }
        return disappearedNumbers;
    }
}
