class Solution {
    public int firstUniqChar(String s) {
        String[] as  = s.split("");
        
        for(int i=0; i<as.length; i++){

            int count =0;
            for(int j=0; j<as.length;j++){
                if(as[i].equals(as[j])){
                    count++;
                    if(count > 1){
                        break;
                    }    
                }
                
            }
            if(count==1){

                return i;
            }
            
        }
        return -1;
    }
}
