import java.util.*;
public class Hashmapdsa {
    static class HashMap<K,V>
    {
        private class Node
        {
            K key;
            V value;
            public Node(K key, V value)
            {
                this.key=key;
                this.value=value;
            }
        }
        private int n ; // number of nodes
        private int N ; // number of buckets N
        private LinkedList<Node>bucket[];
        //@SuppressWarnings("unchecked")
        public HashMap()
        {
            this.N=4;
            this.bucket=new LinkedList[4];
            for(int i=0;i<4;i++)
            {
                this.bucket[i]=new LinkedList<>();
            }
        }
        private int hashFunction(K key){
            int bi=key.hashCode();
            return Math.abs(bi)%N;
        }
        private int searchInLL(K key, int bi)
        {
            LinkedList<Node> ll= bucket[bi];
            int di=0;
            for(int i=0;i<ll.size();i++)
            {
                if (ll.get(i).key==key)
                    return i; //di
            }
            return -1;
        }
        public void puts (K key, V value)
        {
            int bi=hashFunction(key);
            int di=searchInLL(key,bi);

            if(di==-1){
                bucket[bi].add(new Node(key,value));
                n++;
            }else{
                Node data= bucket[bi].get(di);
                data.value=value;
            }

            }
        double lambda=(double) n/N;
        public void rehash()
        {
            LinkedList<Node> old[]= bucket;
            bucket=new LinkedList[2*N];
            for(int i=0;i<2*n;i++){
                bucket[i]=new LinkedList<>();
            }

            for(int i=0;i<old.length;i++)
            {
                LinkedList<Node>ll=old[i];
                for(int j=0;j<ll.size();j++)
                {
                    Node node=ll.get(j);
                    puts(node.key,node.value);

                }
            }

            if (lambda>2){
                rehash();
            }
        }

        public V get(K key){
            int bi=hashFunction(key);
            int di=searchInLL(key,bi);

            if(di==-1)
            {return null;
        }
            else {
                Node node=bucket[bi].get(di);
                return node.value;
            }
    }

    public boolean containsKey(K key){
        int bi=hashFunction(key);
        int di=searchInLL(key,bi);
        if(di==-1)
        return false;
        else
        return true;}

        public V remove(K key){
            int bi=hashFunction(key);
            int di=searchInLL(key,bi);
            if(di==-1)
            {return null;
            }
            else {
                Node node=bucket[bi].remove(di);
                return node.value;
            }
        }

        public boolean isEmpty()
        {
            return n==0;
        }

        public ArrayList<K> keyset()
        {
            ArrayList<K> keys=new ArrayList<>();
            for(int i=0;i< bucket.length;i++)
            {
                LinkedList<Node> ll=bucket[i];
                for(int j=0;j<ll.size();j++)
                {
                    Node node=ll.get(j);
                    keys.add(node.key);
                }

            }
            return keys;
        }
    }
    public static void main(String [] args)
    {
        HashMap<String,Integer> map = new HashMap<>();
        map.puts("India",120);
        map.puts("usa",140);
        ArrayList<String> keys = map.keyset();
        for(int i=0;i< keys.size();i++)
        {
            System.out.println(keys.get(i));
        }
    }

}
