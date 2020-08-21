import java.util.*;
public class InsertBTree{
    static void inorderTraversal(Node node){
        if(node == null){
            return;
        }
        inorderTraversal(node.left);
        System.out.print(node.value + " ");
        inorderTraversal(node.right);
    }

    static void insert(Node temp, int key ){
        Queue<Node> q = new LinkedList<Node>();
        q.add(temp);

        while(!q.isEmpty()){
            temp = q.peek();
            q.remove();
            if(temp.left==null){
                temp.left = new Node(key);
                break;
            }else{
                q.add(temp.left);
            }

            if(temp.right == null){
                temp.right = new Node(key);
                break;
            }else {
                q.add(temp.right);
            }
        }
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);

        inorderTraversal(root);
        System.out.println();

        insert(root, 4);

        inorderTraversal(root);
    }
}