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

// Solution 2

class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> mp = new HashMap<>();

        for (char a : s.toCharArray()) {
            mp.put(a, mp.getOrDefault(a, 0) + 1);
        }

        for (int i = 0; i < s.length(); i++) {
            if (mp.get(s.charAt(i)) == 1) {
                return i;
            }
        }

        return -1;
    }
}
