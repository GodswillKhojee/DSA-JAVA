package Stack;

public class implArrays {
    static class myStack
    {
        private int [] arr;
        private int top ;
        private int size;

        myStack(int size)
        {
            this.size = size; // this keyword is used to distinguish -> it will tell that we are refering to that instance
            arr = new int[size];
            top = -1;
        }

        public void push(int x)
        {
            if(top == size -1)
            {
                System.out.println("stackoverflow!!");
                return;
            }
            arr[++top] = x;
        }
        public int peek()
        {
            if(top == -1)
            {
                System.out.println("no peak");
                return -1;
            }
            return arr[top];
        }
        public int pop()
        {
            if(top == -1)
            {
                System.out.println("can't remove");
                return -1;
            }
            return arr[top--];
        }
        public int getSize()
        {
            return arr.length;
        }
        public boolean isEmpty()
        {
            return top == -1;
        }
    }
    public static void main(String[] args) {
        // stacks follows LIFO principle
        myStack st = new myStack(5);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.push(6);
        System.out.println(st.peek());
        System.out.println(st.pop());
        System.out.println(st.peek());
        System.out.println(st.getSize());
        System.out.println(st.isEmpty());


    }
}
