class Solution {
    public boolean isPalindrome(String s) {
        String res="";
        for(int i=0;i<s.length();i++){
            if(Character.isLetterOrDigit(s.charAt(i))){
                res=res+s.charAt(i);
            }
        }
        res=res.toLowerCase();
        for(int i=0;i<res.length()/2;i++){
            if(res.charAt(i)!=res.charAt(res.length()-i-1)){
                return false;

            }
        }
        return true;


  }
}
