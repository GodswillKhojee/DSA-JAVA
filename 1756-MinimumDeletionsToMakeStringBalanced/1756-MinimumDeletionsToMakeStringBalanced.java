// Last updated: 03/08/2026, 21:14:01
class Solution {
    public int minimumDeletions(String s) {
        Stack<Character> st = new Stack<>();
        st.push(s.charAt(0));
        int i = 1;
        int count = 0;
        while(i<s.length())
        {
            char ch = s.charAt(i);
            if(!st.empty() && st.peek()=='b' && ch == 'a') 
            {
                st.pop();
                count++;
            }
            else 
            {
                st.push(ch);
                
            }
            i++;
        }
        return count;
    }
}