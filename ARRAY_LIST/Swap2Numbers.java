
// swapping 2 numbers in an array list

package ARRAY_LIST;

import java.util.ArrayList;

public class Swap2Numbers {


    public static void swap(ArrayList<Integer> l, int n1, int n2){

            int temp=l.get(n1);
            l.set(n1,l.get(n2));
            l.set(n2, temp);

            for(int i=0; i<l.size(); i++){

                System.out.println(l.get(i));

            }
            
        }


    public static void main(String[] args) {


        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);    list.add(2);    list.add(3);
        list.add(4);    list.add(5);    list.add(6);

        int indx1 = 1;
        int indx2 = 3;

        swap(list, indx1, indx2);

    }
}
