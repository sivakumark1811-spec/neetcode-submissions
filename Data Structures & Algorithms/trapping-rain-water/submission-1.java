class Solution {
    public int trap(int[] height) {
      int max =0;
      int left =0;
      int right =height.length-1;
      int leftmax=0;
      int rightmax=0;
      while(left<right){
        int leftHeight=height[left];
        int rightHeight=height[right];
        if (leftHeight<rightHeight){
            if (leftmax<=leftHeight){
                leftmax=leftHeight;
                left++;    
            }
            else {
                max =max + leftmax-leftHeight;
                left++;
            }   
        }
        else {
           if (rightmax<=rightHeight){
                rightmax=rightHeight;
                right--;    
            }
            else {
                max =max + rightmax-rightHeight;
                right--;
            }  
        }
      }
      return max;
    }
}
