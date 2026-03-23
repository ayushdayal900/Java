package ARRAYS;

//import Loops.print_nos_from_1_to_n;


public class SubArrays {

    public static void makeSubArrays(int aray[]){
        for(int i=0; i<aray.length; i++){
            int start=i;
            for(int j=i; j<aray.length; j++ ){
                int end=j;
                for(int k=start; k<=end; k++){
                    System.out.print(aray[k]+" ");                                                         
                }
                System.out.println();
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int numbers[]={2,4,6,8,10};
        makeSubArrays(numbers);
        
    }
}
