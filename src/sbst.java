public class sbst {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
        }
    }

    public static Node bst(Node root, int val){
        if (root == null) {
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

    public static void inOrder(Node root){
        if (root == null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }

    public static boolean search(Node root, int key){
        if (root == null){
            return true;
        }

        if (root.data > key){
            return search(root.left, key);
        } else if (root.data == key) {
            return true;
        }else {
            return search(root.right, key);
        }
    }


    public static void main(String[] args) {
        int values[] = {8,5,6,10,4,11,1,3,2,9,15,7,12,44,25,77};
        Node root = null;

        for(int i=0; i< values.length; i++){
            root = bst(root, values[i]);
        }
        inOrder(root);
        System.out.println();
        System.out.println("key is there:");
        System.out.println(search(root,25));
    }

}
