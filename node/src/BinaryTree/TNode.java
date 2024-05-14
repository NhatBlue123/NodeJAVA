package BinaryTree;

public class TNode {
    int data;
    TNode left,right;
    TNode(int x)
    {
        this.data = x;
        this.left = this.right = null;
    }
    TNode(int x,TNode ll,TNode rr)
    {
        this.data = x;
        this.left = ll;
        this.right = rr;
    }
}
