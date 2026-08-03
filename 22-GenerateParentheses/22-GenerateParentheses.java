// Last updated: 04/08/2026, 00:21:17
class Solution {
    public void bracket(int n,int l,int r, String s, List<String> ans)
    {
        if(r==n) 
        {
            ans.add(s);
            return ;
        }
        if(l<n) bracket(n, l+1,r,s+"(",ans);
        if(r<l) bracket(n,l,r+1,s+")",ans);
    }
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        bracket(n,0,0,"",ans);
        return ans;
    }
}