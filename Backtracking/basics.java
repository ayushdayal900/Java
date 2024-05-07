import java.util.*;


//---------------- backtrcking in arrays --------------------------------

public class basics {

    public static void changeArray(int arr[], int i, int val){
        // base case
        if(i==arr.length){
            printArray(arr);
            return;
        }
        // recursion

        arr[i]=val;
        changeArray(arr, i+1, val+1); //function call value
        arr[i]=arr[i]-2; // backtrackng step
        
    }

//---------------------------- number of subsets --------------------------------

    public static void findSubsets(String str, String ans, int i){
        //base case
        if(i==str.length()){
            if(ans.length()==0){
                System.out.println("null");
            }
            else{
                System.out.print(ans+"  ");
            }
            
            return;
        }
        //recursion
        
        //yes choce
        findSubsets(str, ans+str.charAt(i), i+1);
        //no choice
        findSubsets(str, ans, i+1);
    }

//------------------------------find permutation in a string-----------------

    public static void findPermutation(String str, String ans){
        //base case
        if(str.length()==0){
            System.out.println(ans);
            return;
        }

        //recurtion
        for(int i=0; i<str.length(); i++){
            
            char curr = str.charAt(i);
            String NewString = str.substring(0, i)+str.substring(i+1);
            findPermutation(NewString, ans+curr);
            
        }

    }
//-----------------------------2x2 n place queens------------------------
    // public static void nQueens(char board[][], int row){
    //     //base
    //     if(row==board.length){
    //         printBoard();
    //         return;
    //     }
    //     //column 
    //     rrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrr
    // }

//------------------------------gridWays----------------------------------
    public static int gridWays(int i, int j, int n, int m){

        //base case

        if(i==n-1 && j==m-1){
            return 1;
        }
        else if(i==n || j==m){//boundry cross condition
            return 0;
        }

        int ways1 = gridWays(i, j+1, n, m);
        int ways2 = gridWays(i+1, j, n, m);
        return ways1+ways2;
    }
//------------------------------print array--------------------------------

    public static void printArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

//-------------------------------main ----------------------------------------

    public static void main(String[] args) {
        int arr[]=new int[5];
        //changeArray(arr, 0, 1);
        //findSubsets("abc", "", 0);
        //findPermutation("abc", "");
        //queemmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmm
        int n=3, m=3;
        System.out.println(gridWays(0, 0, n, m));
       // printArray(arr);
    }
}