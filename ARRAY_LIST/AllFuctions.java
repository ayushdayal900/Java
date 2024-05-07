package ARRAY_LIST;
import java.util.*;

@SuppressWarnings("unchecked")

public class AllFuctions {
    public static void main(String[] args) {
        // we can add any thind in AL
        ArrayList al = new ArrayList();
        al.add("ayush");
        al.add(100.11111);
        al.add(+100);
        al.add(true);

        System.out.println(al);

        al.clear();
        System.out.println(al);
    }
    
}
