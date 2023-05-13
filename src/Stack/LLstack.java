package Stack;

public class LLstack {
    static Node head;

    public static boolean isEmpty(){
        return head == null;
    }

    static class Node{
        int data;
        Node next;
        Node(){}
        Node(int data){
            this.data = data;
        }
        Node(int data, Node next){
            this.data = data;
            this.next = null;
        }
    }

    public static void push(int data){
        Node newNode = new Node(data);
        if(isEmpty()){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public int pop(){
        if (isEmpty()){
            return -1;
        }
        int top = head.data;
        head = head.next;
        return top;
    }

    public int peek(){
        if (isEmpty()) {
            return -1;
        }
        return head.data;
    }

    public static void main(String[] args) {
        LLstack s = new LLstack();
        s.push(5);
        s.push(4);
        s.push(3);
        s.push(2);
        s.push(1);

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }

}
