package Stack;

public class implLINKEDLIST {
    static class StackLL
    {
        public int size;
        public Node top;
        Stackll()
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

        }
    }

    public static void main(String[] args) {

    }
}
