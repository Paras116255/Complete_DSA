package binarySearchTree;

import java.util.ArrayList;

public class pathr2l {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static Node build(Node root, int val){
        if (root == null){
            root = new Node(val);
            return root;
        }

        if (root.data > val){
            root.left = build(root.left, val);
        }else{
            root.right = build(root.right, val);
        }
        return root;
    }


    public static void printPath(ArrayList<Integer> path){
        for (int i=0; i<path.size(); i++){
            System.out.print(path.get(i)+"->");
        }
        System.out.println();
    }
    public static void root2leaf(Node root, ArrayList<Integer> path){
        if (root == null){
            return;
        }
        path.add(root.data);
        //leaf node
        if (root.left == null && root.right == null){
            printPath(path);
        }else {
            root2leaf(root.left, path);
            root2leaf(root.right, path);
        }
        path.remove(path.size()-1);
    }

    public static void main(String[] args) {
        int values[] = {8,5,3,1,10,11,14,6};
        Node root = null;

        for(int i=0; i<values.length; i++){
            root = build(root, values[i]);
        }
        root2leaf(root, new ArrayList<>());
    }
}
