package Trees;

import java.util.LinkedList;
import java.util.Queue;

public class sumTree {
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

   static class Btree{
        static int idx = -1;
        public static Node buildTree(int nodes[]){
            idx++;
            if (nodes[idx] == -1){
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }
   }

    //level order of Nodes

    public static void levelOrder(Node root){
        if (root == null){
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while(!q.isEmpty()){
            Node currNode = q.remove();
            if (currNode == null){
                System.out.println();
                if (q.isEmpty()){
                    break;
                }else {
                    q.add(null);
                }
            }else{
                System.out.print(currNode.data+" ");
                if (currNode.left != null){
                    q.add(currNode.left);
                }
                if(currNode.right != null){
                    q.add(currNode.right);
                }
            }
        }

    }

    //count of nodes
    public static int count(Node root){
        if (root == null){
            return 0;
        }
        int leftcount = count(root.left);
        int rightcount = count(root.right);
        return leftcount+rightcount+1;
    }

    //sum of nodes
    public static int sumOfNodes(Node root){
       if (root == null){
           return 0;
       }
       int leftsum = sumOfNodes(root.left);
       int rightsum = sumOfNodes(root.right);

       return leftsum+rightsum+root.data;
    }


    public static void main(String[] args) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Btree b = new Btree();
        Node root = b.buildTree(nodes);
        System.out.println("Level order of nodes");
        levelOrder(root);
        System.out.println();
        System.out.println("Count number of Nodes");
        System.out.println(count(root));
        System.out.println();
        System.out.println("Sum of nodes");
        System.out.println(sumOfNodes(root));
    }
}
