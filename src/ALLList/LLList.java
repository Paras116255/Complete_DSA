package ALLList;

import org.w3c.dom.Node;

public class LLList {

    //create head
    Node head;

    class Node{
        String data;
        Node next;
        Node(String data){
            this.data = data;
            this.next = null;
        }
    }

    //add first
    public void addFirst(String data){
        Node newNode  = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    //add last
    public void addLast(String data){
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

    //print list
    public void printList(){
        if(head == null){
            System.out.println("list is empty");
            return;
        }

        Node currNode = head;
        while(currNode != null){
            System.out.print(currNode.data+"->");
            currNode = currNode.next;
        }
        System.out.println("Null");
    }

    // delete first
    public void deleteFirst(){
        if (head == null){
            System.out.println("List is empty");
            return;
        }
        head = head.next;
    }

    //delete last
    public void deleteLast(){
        if (head == null){
            System.out.println("list is empty");
            return;
        }
        Node secondLast = head;
        Node last = head.next;
        while(last.next != null){
            last = last.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;
    }


    public static void main(String[] args) {
        LLList list = new LLList();

        list.addFirst("d");
        list.addFirst("c");
        list.addFirst("b");
        list.addFirst("a");
        list.printList();

        list.addLast("e");
        list.addLast("f");
        list.addLast("g");
        list.printList();

        list.deleteFirst();
        list.printList();

        list.deleteLast();
        list.printList();

    }

}
