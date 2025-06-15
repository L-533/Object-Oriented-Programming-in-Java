class Solution {
    public void moveZeroes(int[] nums) {
        boolean removeZeros= true;         
        int countZeros = 0;
        int i=0;

        while(removeZeros){
            if(i==(nums.length-1)){
                removeZeros=false;
             }
             
            if(nums[i]==0){
                for(int j=i; j<(nums.length-1);j++){
                    nums[j]=nums[j+1];                    
                }     

                i=0; 
                countZeros++;         
            }else{
                i++;
            }


             
        }

        for(int j=(nums.length-countZeros); j<nums.length;j++){

            nums[j]=0;
        }
    }
}

//solution 2

class Solution {
    public void moveZeroes(int[] nums) {
        int insertPos = 0;

        for (int num : nums) {
            if (num != 0) {
                nums[insertPos++] = num;
            }
        }

        while (insertPos < nums.length) {
            nums[insertPos++] = 0;
        }
    }
}
