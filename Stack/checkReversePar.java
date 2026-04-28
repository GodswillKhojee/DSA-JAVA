package Stack;

import java.util.Stack;

public class checkReversePar {
    static int minReversal(String expr){
        // Write your code here
       int n = expr.length();
       if (n%2!=0) return -1;

       Stack<Character> st = new Stack<>();
       for(char ch:expr.toCharArray())
       {
           if(ch=='[') st.push(ch);
           else {
               if(!st.isEmpty() && st.peek() == '[') st.pop();
               else st.push(ch);

           }
       }
       int m = st.size();
       int open = 0;
       while(!st.isEmpty() && st.peek() == '[')
       {
           st.pop();
           open++;
       }
       return (m/2 + open%2);
    }
    public static void main(String[] args) {
        String s = "][";
        System.out.println(minReversal(s));
    }
}
