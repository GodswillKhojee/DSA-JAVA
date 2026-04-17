package recursion.lexicographicalOrder;

import java.util.ArrayList;
import java.util.List;

public class normal {
    public static List<Integer> lex(int n)
    {
        int cur = 1;
        List<Integer> ans = new ArrayList<>();
        for(int i = 0; i < n;i++)
        {
            ans.add(cur);
            if(cur*10 <= n) cur *= 10;
            else {
                while(cur%10 == 9 || cur >= n) cur/=10;
                cur++;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int n = 14;
        System.out.println(lex(n));
    }
}
