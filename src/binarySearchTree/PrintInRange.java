package binarySearchTree;

public class PrintInRange {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
          this.data = data;
        }
    }

    public static Node bst(Node root, int val){
        if (root == null){
            root = new Node(val);
            return root;
        }

        if (root.data > val){
            root.left = bst(root.left, val);
        }else{
            root.right = bst(root.right, val);
        }
        return root;
    }

    public static void inorder(Node root){
        if (root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }

   // print in range function
    public static void inRange(Node root, int x, int y){
        if (root == null){
            return;
        }

        if (root.data >= x && root.data <= y){
            inRange(root.left,x,y);
            System.out.print(root.data+" ");
            inRange(root.right, x, y);
        } else if (root.data >=y) {
            inRange(root.left,x,y);
        }else {
            inRange(root.right,x,y);
        }
    }
    public static void main(String[] args) {
        int values[] = {8,5,3,1,4,6,10,11,14};
        Node root = null;

        for(int i=0; i< values.length; i++){
            root = bst(root, values[i]);
        }

        inorder(root);
        System.out.println();
        System.out.println("print in Range 3 to 10:");
        inRange(root, 3,10);

    }
}
