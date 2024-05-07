
// find key

package ARRAYS;
import java.util.*;

public class CheckKey {

    public static int indexKye(int a[],int key){

        int index=-1;

        for(int i=0; i<a.length; i++){
            if(a[i]==key){
                return i;
            }
        }


        return index;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an array : ");
        int size = sc.nextInt();
        int array[]= new int [size];

        System.out.println("Enter array numbers : ");

        for ( int i = 0; i < array.length; i++) {
            array[i]=sc.nextInt();
        }

        System.out.print("Enter key : ");
        int key=sc.nextInt();

        System.out.println("key is at index : "+indexKye(array,key));
    }
}
