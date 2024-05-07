
// check for repeating nnumber

package ARRAYS;
import java.util.*;

public class RepeatingNumbers {

    public static boolean checkRepetingNumbers(int a[]){

        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length; j++) {
                if(a[i]==a[j]){
                    return true;
                }
            }
        }        
            return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size=sc.nextInt();
        int array[]=new int[size];

        for (int i = 0; i < array.length; i++) {
            array[i]=sc.nextInt();
        }

        System.out.println(checkRepetingNumbers(array));
    }
}