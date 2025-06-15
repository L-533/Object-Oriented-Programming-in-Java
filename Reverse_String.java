class Solution {
    public void reverseString(char[] s) {
        for (int i = 0, j = s.length - 1; i < j; i++, j--) {
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
        }
    }
}

//solution 2

class Solution{
public void reverseString(char[]s){
  int left=0,right=s.length-1;
  while(left<right){
    char temp=s[left];
    s[left]=s[right];
    s[right]=temp;

    left++;
    right--;
    }
  }
}
