package leetcode;


public class MajorityElement {
    public static void main(String[] args) {
        // element will be always in the middle of the numsay
        //sort it and mid element will always be majority element
        //Time complexity will be O(nlog(n))
      /*  int[] nums = {3,2,3};*/
      /*  numsays.sort(nums);*/
      /*  int mid = nums[nums.length/2];*/
      /*  System.out.println(mid);*/

       /* set majority as first element, on each occurence count 1 and on difference occurence   */
       /*         substract 1 and in case of votes 0, change to next element as majority*/
        int[] nums = {2,2,1,1,1,2,2};
        int majority = nums[0];
        int votes = 1 ;
        for (int i = 0; i < nums.length; i++) {
            if(votes == 0) {
                majority = nums[i];
                votes++;
            }
            else if(majority == nums[i]) {
                votes++;
            }  else votes--;
        }
        System.out.println(majority);

    }
}
