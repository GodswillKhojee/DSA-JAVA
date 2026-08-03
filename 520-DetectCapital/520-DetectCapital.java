// Last updated: 03/08/2026, 21:14:56
class Solution {
    public boolean detectCapitalUse(String word) {
        int c = 0;
        for(char ch: word.toCharArray())
        {
            if(ch>='A' && ch<= 'Z') c++;
        }

        if(c == word.length()) return true;
        if(c == 0) return true;
        if(c== 1 && word.charAt(0) >= 'A' && word.charAt(0) <= 'Z') return true;
        
        return false;
    }
}