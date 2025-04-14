package leetcode;

import java.util.PriorityQueue;

public class FindKthLargestElement {
    public static void main(String[] args) {
        int[] nums = {3, 2, 1, 5, 6, 4};
        int k = 2;
        System.out.println(findKthLargest(nums, k));
    }

    private static int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int num : nums) {
            pq.add(num);
            if(pq.size() > k) {
                pq.poll();
            }
        }
        System.out.println(pq);
        return pq.poll();


        // Priority Queue - min value is in top tree by default
       /* System.out.println("Print Priority Queue: " + pq);
        System.out.println("Print top element of heap: "+pq.peek());
        System.out.println("Remove element from the heap: " +pq.poll());
        System.out.println("Final Priority Queue: " + pq);*/




    }
}
