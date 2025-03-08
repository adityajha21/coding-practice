package leetcode;

// Two pointer
public class ContainerWithMostWater {
    public static void main(String[] args) {
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println(containerWithMostWater(height));
    }

    private static int containerWithMostWater(int[] heights) {
        int maxArea = 0;
        int left =0;
        int right = heights.length-1;
        for (int i = 0; i < heights.length - 1; i++) {
            int height = Math.min(heights[left], heights[right]);
            int width = right - left;  // move only index
            int area = height * width;
            maxArea = Math.max(maxArea, area);

            if(heights[left] < heights[right]) {
                left++;
            } else right--;

        }
        return maxArea;
    }
}
