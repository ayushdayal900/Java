
// maximum in an array list
package ARRAY_LIST;

import java.util.ArrayList;

public class MaximInAL {
    public static void main(String[] args) {
        
        ArrayList<Integer> l = new ArrayList<>();

        l.add(2);    l.add(2);
        l.add(3);    l.add(4);
        l.add(5);    l.add(6);

        int maxm = Integer.MIN_VALUE;
//---------maxm in AL       O(n)
        for(int i=0; i<l.size(); i++){
            maxm = Math.max(maxm,l.get(i));
        }

        System.out.println(maxm);
    }
}
