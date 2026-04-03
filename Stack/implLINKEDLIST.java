package Stack;

public class implLINKEDLIST {
    static class StackLL
    {
        public int size;
        public Node top;
        StackLL()
        {
            size = 0;
            top = null;
        }
        static class Node
        {
            public int data;
            public Node next;
            Node(int data)
            {
                this.data = data;
                next = null;
            }
        }

        public void push(int value)
        {
            Node temp = new Node(value);
            temp.next = top;
            top = temp;
            size++;
        }
        public int pop()
        {
            if(top == null)
            {
                System.out.println("stack is empty");
                return -1;
            }

            Node temp = top;
            top = top.next;
            size--;
            return temp.data;
        }
        public int getSize()
        {
            return size;
        }
        public int top()
        {
            if(top == null)
            {
                System.out.println("empty stack");
                return -1;
            }
            return top.data;
        }
    }

    public static void main(String[] args) {
        StackLL st = new StackLL();
        st.push(3);
        st.push(2);
        st.push(1);
        st.push(5);

        System.out.println(st.top());
        System.out.println(st.pop());
        System.out.println(st.top());
        System.out.println(st.getSize());
    }
}
