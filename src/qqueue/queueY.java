package qqueue;

public class queueY {
   static class queueN {
       static int arr[];
       static int size;
       static int rear = -1;

       queueN(int n) {
           arr = new int[n];
           this.size = n;
       }

       public static boolean isEmpty() {
           return rear == -1;
       }


       public static void add(int data) {
           if (rear == size - 1) {
               System.out.println("Full queue");
               return;
           }
           rear++;
           arr[rear] = data;
       }

       public int remove() {
           if (isEmpty()) {
               System.out.println("Empty queue");
               return -1;
           }
           int front = arr[0];
           for (int i = 0; i < rear; i++) {
               arr[i] = arr[i + 1];
           }
           rear--;
           return front;
       }


       public int peek() {
           if (isEmpty()) {
               System.out.println("Empty queue");
               return -1;
           }
           return arr[0];
       }

   }

    public static void main(String[] args) {
        queueN q = new queueN(5);
        q.add(5);
        q.add(4);
        q.add(3);
        q.add(2);
        q.add(1);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }

    }
}
