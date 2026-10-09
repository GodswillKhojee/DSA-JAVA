// Last updated: 09/10/2026, 21:15:54
class Solution {
    public void check(int idx, String s,List<String> inner, List<List<String>> outer)
    {
        if(idx >= s.length())
        {
            outer.add(new ArrayList<>(inner));
            return;
        }
        for(int i = idx;i<s.length();i++)
        {
            if(isPalindrone(i,idx,s))
            {
                inner.add(s.substring(idx,i+1));
                check(i+1,s,inner,outer);
                inner.remove(inner.size()-1);
            }
        }
    }
    public boolean isPalindrone(int end, int start, String s)
    {
        while(start<=end)
        {
            if(s.charAt(start++) != s.charAt(end--)) return false;
        }
        return true;
    }
    public List<List<String>> partition(String s) {
        List<String> inner = new ArrayList<>();
        List<List<String>> outer = new ArrayList<>();

        check(0,s,inner,outer);
        return outer;
    }
}