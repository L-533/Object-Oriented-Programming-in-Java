class Solution {
    public boolean isAnagram(String s, String t) {
        TreeSet<String> string_1 = new TreeSet<>();
        TreeSet<String> string_2 = new TreeSet<>();

        s = s.replaceAll("[^\\x00-\\x7F]", "");
        t = t.replaceAll("[^\\x00-\\x7F]", "");
        
        String[] string_s = s.split("");
        String[] string_t = t.split("");

        for(int i=0;i< string_s.length;i++){
            string_1.add(string_s[i]);
        }

        for(int i=0;i< string_t.length;i++){
            string_2.add(string_t[i]);
        }
        

        if(string_1.equals(string_2)){
            return true;
        }
        return false;
    }
}
