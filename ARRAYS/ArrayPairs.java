// Q to make distinct array pairs by an array

package ARRAYS;

/**
 * ArrayPairs
 */
public class ArrayPairs {


    public static void pairs(int a[]){
        for(int i=0; i<a.length; i++){
            for(int j=i+1; j<a.length; j++){
                System.out.print("("+i+","+j+") ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        
        int a[]={1,2,3,4,5};
        pairs(a);


    }
}