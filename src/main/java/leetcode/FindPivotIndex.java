package leetcode;

public class FindPivotIndex {
    public static void main(String[] args) {
        int[] arr = {1,7,3,6,5,6};
        int sum =0;
        int left =0;
        int right =0 ;
        int j= arr.length-1 ;

        //find sum of all numbers
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
       right = sum;

        for (int i = 0; i < arr.length; i++) {
            right-=arr[i];
            if(left == right){
                System.out.println(i);
            }
            left+=arr[i];
        }
       }
}
