// Last updated: 03/08/2026, 21:16:31
class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        String [] str = s.split("\\s+");
        int i = 0; 
        int j = str.length-1;
        while(i<j)
        {
            String temp = str[i];
            str[i] = str[j];
            str[j] = temp;
            i++;
            j--;
        }
        String ans = "";
        i = 0;
        while(i<str.length)
        {
            ans += str[i++];
            if(i!=str.length) ans += " ";
        }
        return ans;
    }
}