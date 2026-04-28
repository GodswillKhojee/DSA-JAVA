package Stack;

public class implArrays {
    static class myStack
    {
        int [] arr;
        int size;
        int top;
        myStack(int n){
            size = n;
            top = -1;
            arr = new int[n];
        }
        boolean isEmpty(){
            return top == -1;
        }
        boolean isFull(){
            return top == size-1;
        }
        int peek(){
            if(isEmpty()) return -1;
            return arr[top];
        }
        void push(int x){
            if(isFull()) return;
            arr[++top] = x;
        }
        int pop(){
            if (isEmpty()) return -1;
            return arr[top--];
        }

    }
    public static void main(String[] args) {
        // stacks follows LIFO principle
        int n = 5;
        myStack st = new myStack(n);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.push(6);
//        System.out.println(st.peek());
//        System.out.println(st.pop());
//        System.out.println(st.peek());
//        System.out.println(st.getSize());
//        System.out.println(st.isEmpty());

        for(int i = 0; i < n; i++)
        {
            System.out.print(st.pop());
        }

    }
}
