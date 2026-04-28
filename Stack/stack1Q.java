package Stack;

import java.util.LinkedList;
import java.util.Queue;


class StackQ{
    Queue<Integer> q = new LinkedList<>();
    void push(int val)
    {
        q.add(val);
        for(int i = 0; i < q.size() - 1; i++){
            q.add(q.remove());
        }
    }

    int pop()
    {
        if(q.isEmpty())
        {
            System.out.println("Stack is empty!!");
            return -1;
        }

        return q.remove();
    }
    int peek()
    {
        if(q.isEmpty())
        {
            System.out.println("Stack is empty!!");
            return -1;
        }

        return q.peek();
    }
}

public class stack1Q {
    public static void main(String[] args) {
        StackQ st = new StackQ();
        st.push(1);
        st.push(5);
        st.push(3);
        st.push(2);
        System.out.println(st.peek());
        System.out.println(st.pop());
        System.out.println(st.peek());
    }
}
