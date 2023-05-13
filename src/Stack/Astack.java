package Stack;

import java.util.ArrayList;
import java.util.Stack;

public class Astack {

    static class stack{
        static ArrayList<Integer> list = new ArrayList<>();

        public static boolean isEmpty(){
            return list.size() == 0;
        }

        public static void push(int data){
            list.add(data);
        }

        public int pop(){
            if (isEmpty()){
                return -1;
            }
            int top = list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }

        public int peek(){
            if (isEmpty()){
                return -1;
            }

            return list.get(list.size()-1);
        }
    }

    public static void main(String[] args) {
        stack s = new stack();
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
