package queue;

import java.util.*;
public class implementQueueUsingStack {
    static class QueueSt
    {
        Stack<Integer>  st1;
        Stack<Integer> st2;
        QueueSt()
        {
            st1 = new Stack<>();
            st2 = new Stack<>();
        }

        void add(int x)
        {
            while(!st1.isEmpty())
            {
                st2.push(st1.pop());
            }

            st1.push(x);

            while(!st2.isEmpty())
            {
                st1.push(st2.pop());
            }
        }

        int remove()
        {
            if(st1.isEmpty()) return -1;
            return st1.pop();
        }

        int top()
        {
            return  st1.peek();
        }

        boolean isEmpty()
        {
            return st1.isEmpty();
        }
    }
    public static void main(String[] args) {
        QueueSt q = new QueueSt();
        q.add(5);
        q.add(2);
        q.add(3);
        System.out.println(q.top());
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.isEmpty());
        System.out.println(q.remove());
        System.out.println(q.isEmpty());
    }
}
