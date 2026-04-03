package Stack;

import java.util.*;

class Stack2Q{
    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();

    void push(int val)
    {
        q2.add(val);

        while(!q1.isEmpty())
        {
            q2.add(q1.remove());

        }

        Queue<Integer> temp = q2;
        q2 = q1;
        q1 = temp;
    }

    int pop() {
        if (q1.isEmpty()) {
            System.out.println("stack empty");
            return -1;
        }
        return q1.remove();
    }
    int peek()
    {
        if (q1.isEmpty()) {
            System.out.println("stack empty");
            return -1;
        }
        return q1.peek();
    }
}
public class impl2Q {
    public static void main(String[] args) {
        Stack2Q st = new Stack2Q();
        st.push(1);
        st.push(3);
        st.push(2);
        st.push(15);
        System.out.println(st.peek());
        System.out.println(st.pop());
        System.out.println(st.peek());

    }
}
