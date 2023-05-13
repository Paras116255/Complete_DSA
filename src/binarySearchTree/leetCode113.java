package binarySearchTree;

import java.util.ArrayList;
import java.util.List;

public class leetCode113 {
    //path sum 2

    static class Node{
        int data;
        Node left;
        Node right;
        Node(){}
        Node(int data) {
            this.data = data;
        }
        Node(int data,Node left, Node right){
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }

    public List<List<Integer>> pathSum(Node root, int targetSum){
        List<Integer> currPath = new ArrayList<>();
        List<List<Integer>> allPath = new ArrayList<>();
        findPath(root,targetSum,currPath,allPath);
        return allPath;
    }

    public static void findPath(Node currNode, int sum, List<Integer> currPath,List<List<Integer>> allPath){
        if (currNode == null){
            return;
        }

        currPath.add(currNode.data);
        if (currNode.data == sum && currNode.left == null && currNode.right == null){
            allPath.add(new ArrayList<>(currPath));
        }else {
            findPath(currNode.left, sum - currNode.data, currPath, allPath);
            findPath(currNode.right, sum - currNode.data, currPath, allPath);
        }
        currPath.remove(currPath.size()-1);
    }

}
