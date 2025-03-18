import java.util.*;


public class Heap_ {

     
    public static class Heap {
        ArrayList<Integer> al = new ArrayList<>();

        public void add(int data){
            // add at last index
            al.add(data);

            int c = al.size() - 1;  //child pos
            int p = (c-1)/2;  //parent pos

            // O(log(n))
            while (al.get(c) < al.get(p)) {
                // swap
                int t = al.get(c);
                al.set(c, al.get(p));
                al.set(p, t);

                c = p;
                p=(c-1)/2;
            }
        } 

        public int peek(){
            return al.get(0);
        }

        private void heapify(int i){
            int l = 2*i+1;
            int r = 2*i+2;
            int minIndx = i;

            if(l < al.size() && al.get(minIndx) > al.get(l)){ minIndx = l;}
            if(r < al.size() && al.get(minIndx) > al.get(r)){ minIndx = r;}
            
            if(minIndx != i){
                //swap
                int t = al.get(i);
                al.set(i, al.get(minIndx));
                al.set(minIndx, t);

                heapify(minIndx);
            }
        }

        public int remove(){
            int data = al.get(0);

            // s1 : swap
            int t = al.get(0);
            al.set(0, al.get(al.size() - 1));
            al.set(al.size() - 1, t);

            // s2 : delete last element
            al.remove(al.size()-1);

            // s3: heapify
            heapify(0);
            return data;
        }


        public boolean isEmpty(){
            if(al.size()==0){
                return true;
            }else{
                return false;
            }
        }
    }




    public static void main(String[] args) {
        Heap h = new Heap();
        h.add(0);       h.add(4);
        h.add(1);       h.add(5);


        while(!h.isEmpty()){
            System.out.println(h.peek());
            h.remove();
        }


    }
}