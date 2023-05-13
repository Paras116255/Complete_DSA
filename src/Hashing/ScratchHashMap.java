package Hashing;

import java.util.ArrayList;
import java.util.LinkedList;

public class ScratchHashMap {
    static class HashMap<K,V>{
        private class Node{
            K key;
            V value;
            Node(K key, V value){
                this.key = key;
                this.value = value;
            }
        }
        private int n;
        private int N;
        private LinkedList<Node> bucket[];

        public HashMap(){
            this.N = 4;
            this.bucket = new LinkedList[4];
            for (int i=0;i<4;i++){
                this.bucket[i] = new LinkedList<>();
            }
        }

        //hashFunction
        private int hashFunction(K key){
            int bi = key.hashCode();
            return Math.abs(bi)%N;
        }

        //search in linkedlist
        private int searchInLL(K key, int bi){
            LinkedList<Node> LL = bucket[bi];
            for (int i=0; i<LL.size();i++){
                if (LL.get(i).key == key){
                    return i;
                }
            }
            return -1;
        }

        //rehash
        private void rehash(){
            LinkedList<Node> oldBucket[] = bucket;
            bucket = new LinkedList[N*2];
            for (int i=0; i<N*2; i++){
                bucket[i] = new LinkedList<>();
            }

            for (int i = 0; i< oldBucket.length; i++){
                LinkedList<Node> LL = oldBucket[i];
                for (int j=0; j<LL.size(); j++){
                    Node node = LL.get(j);
                    put(node.key, node.value);
                }
            }
        }

        //put function
        public void put(K key, V value){
            int bi = hashFunction(key);
            int di = searchInLL(key, bi);

            if(di == -1){
                bucket[bi].add(new Node(key,value));
                n++;
            }else {
                Node data = bucket[bi].get(di);
                data.value = value;
            }

            double lambda = (double) n/N;
            if (lambda>2.0){
                rehash();
            }
        }

        //get method
        public V get(K key){
            int bi = hashFunction(key);
            int di = searchInLL(key, bi);

            if (di == -1){
                return null;
            }else{
                Node node = bucket[bi].get(di);
                return node.value;
            }
        }

        // contains Key

        public boolean containsKey(K key){
            int bi = hashFunction(key);
            int di = searchInLL(key, bi);

            if (di ==-1){
                return false;
            }else{
                return true;
            }
        }

        //remove function
        public V remove(K key){
            int bi = hashFunction(key);
            int di = searchInLL(key, bi);

            if (di ==-1){
                return null;
            }else{
                Node node = bucket[bi].remove(di);
                n--;
                return node.value;
            }
        }

        //isEmpty function
        public boolean isEmpty(){
            return n ==0;
        }

        //keyset function
        public ArrayList<K> keyset(){
            ArrayList<K> keys = new ArrayList<>();

            for(int i=0;i< bucket.length;i++){
                LinkedList<Node> LL = bucket[i];
                for (int j=0; j<LL.size(); j++)
                {
                    Node node = LL.get(j);
                    keys.add(node.key);
                }
            }
            return keys;
        }
    }
}
