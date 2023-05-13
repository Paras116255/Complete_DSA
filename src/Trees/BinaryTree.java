package Trees;

public class BinaryTree {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class bt{
        static int idx = -1;
        public static Node buildtree(int nodes[]){
            idx++;
            if (nodes[idx] == -1){
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left = buildtree(nodes);
            newNode.right = buildtree(nodes);

            return newNode;
        }
    }

    public static void main(String[] args) {
        int nodes[] = {8,6,-1,-1,4,-1,-1,7,2,-1,-1,9,3,-1,-1,1,-1,-1};
        bt b = new bt();
        Node root = b.buildtree(nodes);
        System.out.println(root.data);
    }

}
