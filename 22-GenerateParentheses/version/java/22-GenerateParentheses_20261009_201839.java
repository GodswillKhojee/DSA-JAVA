// Last updated: 09/10/2026, 20:18:39
class Solution {
    public void check(String val, int l , int r, List<String> ans,int n)
    {
        if(r == n)
        {
            ans.add(val);
            return;
        }

        if(l < n) check(val+"(",l+1,r,ans,n);
        if(r < l) check(val+")",l,r+1,ans,n);
    }
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        check("",0,0,ans,n);
        return ans;
    }
}