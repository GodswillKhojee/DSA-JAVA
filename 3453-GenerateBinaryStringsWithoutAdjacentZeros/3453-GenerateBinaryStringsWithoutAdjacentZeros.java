// Last updated: 03/08/2026, 21:13:14
class Solution {
    public void bin(int n , List<String> ls,String s)
    {
        if(n==s.length())
        {
            ls.add(s);
            return;
        }
        bin(n,ls,s+"1");
        if(s.length() == 0 || s.charAt(s.length()-1) != '0') bin(n,ls,s+"0");
    }
    public List<String> validStrings(int n) {
        List<String> ls = new ArrayList<>();
        bin(n,ls,"");
        Collections.sort(ls);
        return ls;
    }
}