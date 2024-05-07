package clg.java;

import java.util.*;

// import Loops.avoid_10s_multiple;

/**
 * helloworld
 */
public class clg {
//--------------------------------hello world------------------------

    public static void helloworld(){
        System.out.println("hello world");
    }

//----------------------------factorial-------------------------------

    public static int fact(int n){
        if(n==0){
            return 1;
        }
        return n*fact(n-1);
    }
    //----------------------------check key matrix----------------------------------

    public static boolean matx(int mat[][], int k){
        
        for(int i=0; i<mat.length; i++){
            for(int j=0; j<mat[0].length; j++){
                if(mat[i][j]==k){
                    return true; 
                }
            }
        }
        return false;
    }
    //----------------------------even odd 

    public static int evenOdd(int n){

        if((n&1)==0){
            return 0;
        }
        else{
            return 1;
        }
        
    }
    //------------------------------- add

    public static int add(int n1, int n2){
        return n1+n2;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //------------------------------hello world
        helloworld();
        
        //--------------------------factorial
        System.out.println("enetr number to find fact");
        int g = sc.nextInt();
        System.out.println("fact of "+g+ "is "+fact(g));

        //---------------------ceck key----------------
        int[][] matrix = {{1,2,3},
                          {4,5,6},
                          {7,8,9}
                        };
        System.out.println("enter key to search:");
        int key=sc.nextInt();
        System.out.println(matx(matrix,key));

        //---------------------------even odd
        int check=evenOdd(3);
        if (check==0){
            System.out.println("even");
        }
        else{
            System.out.println("false");
        }

        //--------------------- table of given no
        System.out.println("enetr a number to print ist table:");
        int n=sc.nextInt();
        for(int i=1; i<11; i++){
            System.out.println(i*n);
        }

        //------------------- swap
        System.out.println("swapping program");
        int n1=1;
        int n2=3;
        System.out.println(n1);
        System.out.println(n2);

        int temp=n1;
        n1=n2;
        n2=temp;
        System.out.println(n1);
        System.out.println(n2);

        //------------------ add
        System.out.println();
        System.out.println("sum = "+add(2,3));

       //---------------- calculate average-----------
        
       System.out.println();
       int n11,n22,n33,n44;
       System.out.println("enetr number to take average");
        n11=sc.nextInt();
        n22=sc.nextInt();
        n33=sc.nextInt();
        n44=sc.nextInt();

        int avg = (n11+n22+n33+n44)/4;
        System.out.println("avg = "+avg);

        //--------------------print color switch

        System.out.println();
        System.out.println("enter number to print color :");
        System.out.println("1.red   2.voilet    3.blue  4.pink");
        int ch=sc.nextInt();

        switch(ch){
            case 1:System.out.println("red"); break;
            case 2:System.out.println("voilet"); break;
            case 3:System.out.println("blue"); break;
            case 4:System.out.println("pink"); break;
            default: System.out.println("invalid int"); break;

        }
    }
}