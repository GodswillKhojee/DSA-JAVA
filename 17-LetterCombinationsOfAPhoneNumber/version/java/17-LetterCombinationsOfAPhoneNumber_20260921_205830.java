// Last updated: 21/09/2026, 20:58:30
class Solution {
    public void check(int idx , String digits,ArrayList<String> ans, HashMap<Character, String> map, String term)
    {
        if(idx >= digits.length())
        {
            ans.add(term);
            return ;
        }

        char ch = digits.charAt(idx);
        String str = map.get(ch);
        for(int i = 0; i < str.length();i++)
        {
            term+=str.charAt(i);
            check(idx+1,digits,ans,map,term);

            term = term.substring(0,term.length()-1);
        }
       
    }
    public List<String> letterCombinations(String digits) {
        ArrayList<String> ans = new ArrayList<>();
        HashMap<Character, String> map = new HashMap<>();
        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ghi");
        map.put('5',"jkl");
        map.put('6',"mno");
        map.put('7',"pqrs");
        map.put('8',"tuv");
        map.put('9',"wxyz");

        check(0,digits,ans,map,"");

        return ans;

    }
}