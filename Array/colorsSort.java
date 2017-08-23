/*
Given an array with n objects colored red, white or blue, sort them so that objects of the same color are adjacent, with the colors in the order red, white and blue.
Here, we will use the integers 0, 1, and 2 to represent the color red, white, and blue respectively.

Note:
You are not suppose to use the library's sort function for this problem.
*/

class colorsSort {
    public void sortColors(int[] nums) {
        int[] count = new int[3];
        Arrays.fill(count, 0);
        for(int i=0; i<nums.length; i++){
            count[nums[i]] += 1;
        }
        int k=0;
        for(int j=0; j<=2;){
           if(count[j]!=0){
               nums[k++] = j;
               count[j] -=1;
           }else{
               j++;
           }   
        }        
    }
}