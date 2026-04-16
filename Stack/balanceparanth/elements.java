package Stack.balanceparanth;

public class elements {
    public static void main(String[] args) {
        String st = "“[ ( )";
        int c = 0;
        int b = 0;
        int s = 0;
        for(int i = 0; i < st.length();i++)
        {
            if( st.charAt(i) == '[') b++;
            else if(st.charAt(i) == '(') c++;
            else if(st.charAt(i) == '{') s++;

            if( st.charAt(i) == ']') b--;
            else if(st.charAt(i) == ')') c--;
            else if(st.charAt(i) == '}') s--;
        }
        if(c==0 && b == 0 && s== 0) System.out.println("true");
        else System.out.println("false");
    }
}

