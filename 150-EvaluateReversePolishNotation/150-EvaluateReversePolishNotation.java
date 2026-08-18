// Last updated: 18/08/2026, 20:29:46
class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        for(String ch : tokens)
        {
            if (!ch.equals("+") && !ch.equals("-") && !ch.equals("*") && !ch.equals("/")) 
                st.push(Integer.parseInt(ch));
            else 
            {
                int v1 = st.pop();
                int v2 = st.pop();
                if (ch.equals("+")) {
                    st.push(v2 + v1);
                }
                else if (ch.equals("-")) {
                    st.push(v2 - v1);
                }
                else if (ch.equals("*")) {
                    st.push(v2 * v1);
                }
                else if (ch.equals("/")) {
                    st.push(v2 / v1);
                }
            }
        }
        return st.pop();
    }
}