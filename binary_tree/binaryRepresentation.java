package binary_tree;

class node
{
    int data;
    node left;
    node right;
    node(int key)
    {
        data = key;
    }
}
public class binaryRepresentation {
    public static void main(String[] args) {
        node root = new node(1);
        root.left = new node(2);
        root.right = new node(3);
        root.right.left = new node(5);
        System.out.println(root.data);
    }

}
