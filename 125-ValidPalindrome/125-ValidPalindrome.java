// Last updated: 04/08/2026, 00:20:11
class Solution {
    public boolean isPalindrome(String s) {
         String cleaned = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
         int first = 0;
         int last = cleaned.length() - 1;
        //  bool ispal = true;
         while (first < last)
         {
            if(cleaned.charAt(first) != cleaned.charAt(last))
            {
                return false;
            }
            
            first++;
            last--;
            
         }
        return true;
         
    }
}