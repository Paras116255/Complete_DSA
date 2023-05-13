package binarySearchTree;

public class deleteANode {
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
        }
        else{
            root.right = bst(root.right, val);
        }
        return root;
    }

    public static void inorder(Node root){
        if (root == null){
            return ;
        }

        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }

    public static boolean search(Node root, int key){
        if (root == null){
            return true;
        }

        if (root.data > key) {
            return search(root.left, key);
        } else if (root.data == key) {
            return true;
        }else{
            return search(root.right, key);
        }
    }

   public static Node delete(Node root, int val){
        if (root.data > val){
            root.left = delete(root.left, val);
        } else if (root.data < val) {
            root.right = delete(root.right, val);
        }else{
            // case1: no child
            if (root.left == null && root.right == null){
                return null;
            }

            //case2: one child
            if (root.left == null){
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            // case3: two children
            Node is = inorderSuccessor(root.right);
            root.data = is.data;
            root.right = delete(root.right,is.data);
        }

        return root;
   }

   public static Node inorderSuccessor(Node root){
        while(root.left != null){
            root = root.left;
        }
        return root;
   }

    public static void main(String[] args) {
        int values[] = {8,5,3,1,4,6,10,11,14};
        Node root = null;

        for(int i=0; i< values.length; i++){
            root = bst(root, values[i]);
        }

        System.out.println("searched key 1 in tree:");
        System.out.println(search(root, 1));
        System.out.println();
        inorder(root);
        delete(root,4);
        System.out.println();
        System.out.println("After delete 5 using delete function");
        inorder(root);
    }
}
