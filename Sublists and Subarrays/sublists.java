import java.util.ArrayList;
import java.util.Arrays;


public class sublists {
    public static void main(String[] args) {
        ArrayList<Integer> lst = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
        int sum=0;
        for (int i=(lst.size()+1)%2; i<lst.size();i+=2)
            for (int j=0; j<=i; j++)
            {
                System.out.println(lst.subList(j, lst.size()-i+j));
                ArrayList<Integer> lst1=new ArrayList<>(lst.subList(j, lst.size()-i+j));
                for (int number : lst1){
                    sum += number;
                }

            }
                
            System.out.println(sum);
    }
}
