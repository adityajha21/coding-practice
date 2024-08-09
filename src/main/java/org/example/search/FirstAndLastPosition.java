package org.example.search;

import java.util.Arrays;

public class FirstAndLastPosition {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 4, 4, 4, 6, 10, 30};
        int target = 4;
        int[] ans = searchRanges(arr, target);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] searchRanges(int[] arr, int target) {
        int[] ans = {-1, -1};
        ans[0] = searchNumbers(arr, target, true);
        ans[1] = searchNumbers(arr, target, false);
        return ans;
    }

    private static int searchNumbers(int[] nums, int target, boolean startIndex) {
        {
            int ans = -1;
            int start = 0;
            int end = nums.length - 1;
            while (start <= end) {
                int mid = (start + end) / 2;
                if (target > nums[mid]) {
                    start = mid + 1;
                } else if (target < nums[mid]) {
                    end = mid - 1;
                } else {
                    ans = mid;
                    if (startIndex) {
                        end = mid - 1;
                    } else {
                        start = mid + 1;
                    }
                }
            }

            return ans;
        }
    }

}