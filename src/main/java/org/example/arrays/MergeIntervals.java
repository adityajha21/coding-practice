package org.example.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MergeIntervals {
    public static void main(String[] args) {
        int[][] intervals = {
                {1, 3}, {2, 6}, {8, 10}, {15, 18}
        };

        int[][] result = mergeIntervals(intervals);
        System.out.println("Merged Intervals:");
        for (int[] interval : result) {
            System.out.println(Arrays.toString(interval));
        }
    }

    private static int[][] mergeIntervals(int[][] intervals) {
        if (intervals.length <= 1) return intervals;

       // Sort by ascending starting point
        Arrays.sort(intervals, Comparator.comparingInt(i -> i[0]));

        List<int[]> result = new ArrayList<>();

        int[] newInterval = intervals[0];
        System.out.println(Arrays.toString(newInterval));
        result.add(newInterval);

        for (int[] interval : intervals) {
            if (interval[0] <= newInterval[1]) {
                System.out.println(interval[0]);
                // Overlapping intervals,
                // update the end if needed
                newInterval[1] = Math.max(newInterval[1], interval[1]);
                }
            else {
                // Disjoint intervals,
                // add the new interval to the list
                 newInterval = interval;
                result.add(newInterval);
            }
        }
        return result.toArray(new int[result.size()][]);

    }
}
