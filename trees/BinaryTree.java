class Node{
    int value;
    Node left,right;

    public Node(int item){
        value = item;
        left = right = null;
    }
}

public class BinaryTree{
    Node root;

    public BinaryTree(int key){
        root = new Node(key);
    }

    public BinaryTree(){
        root = null;
    }

    public static void main(String[] args) {
        BinaryTree btree = new BinaryTree(1);
        btree.root.left = new Node(2);
        btree.root.right = new Node(3);
        System.out.print(btree.root.value);
    }
}