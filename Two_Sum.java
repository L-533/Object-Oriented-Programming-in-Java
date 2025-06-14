class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = {0,0};
        boolean found= false;

        for(int i=0;i<nums.length;i++){
                
                for(int j=0;j<nums.length;j++){
                    if(((nums[i] + nums[j])==target) && found==false && i!=j){

                        result[0]=i;
                        result[1]=j;
                        found=true;

                        
                    }
             }
             
        }
        return result;
    }
    
}
