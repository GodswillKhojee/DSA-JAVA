// Last updated: 04/08/2026, 00:21:30
import java.util.*;
class Solution {
    public boolean isPalindrome(int x) {
        String str = Integer.toString(x);
        int a = 0;
        int b = str.length() - 1;
        boolean isit = true;


        while(a < b)
        {
            if(str.charAt(a) != str.charAt(b))
            {
                isit = false;
                break;
            }
            else
            {
                a++;
                b--;
            }
        }
        if(isit)
        {
            return true;
        }
        else return false;

    }
}