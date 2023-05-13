package ALLList;

import org.w3c.dom.Node;

public class ReverseLLList {
    Node head;

    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public void addFirst(int data){
        Node newNode = new Node(data);
        if (head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }

        Node currNode = head;
        while(currNode.next != null){
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    public void printList(){
        if (head == null){
            System.out.println("list is empty");
            return;
        }
        Node currNode = head;
        while(currNode != null){
            System.out.print(currNode.data+"->");
            currNode = currNode.next;
        }
        System.out.println("null");
    }

    public void deleteFirst(){
        if (head == null){
            System.out.println("list is empty");
            return;
        }
        head = head.next;
    }

    public void deleteLast(){
        if (head == null){
            System.out.println("List is empty");
            return;
        }
        if (head.next == null){
            head = null;
        }

        Node secondLast = head;
        Node last = head.next;
        while(last.next != null){
            last = last.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;

    }

    public void reverseList(){
        Node prevNode = head;
        Node currNode = head.next;
        while(currNode != null){
            Node nextNode = currNode.next;
            currNode.next = prevNode;

            //update
            prevNode = currNode;
            currNode = nextNode;
        }
        head.next = null;
        head = prevNode;

    }

    public static void main(String[] args) {
        ReverseLLList rll = new ReverseLLList();

        rll.addFirst(4);
        rll.addFirst(3);
        rll.addFirst(2);
        rll.addFirst(1);
        rll.printList();

        System.out.println("Reversed Linked list");
        rll.reverseList();
        rll.printList();


    }



}
