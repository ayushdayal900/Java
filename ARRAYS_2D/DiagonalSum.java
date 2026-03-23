package ARRAYS_2D;

import java.util.*;

public class DiagonalSum {

    public static void diagSum(int matrix[][]){
        
        int sum=0;
        

        //----------------------m1---------------- O(n^2)
        // int n=matrix[0].length;
        // for(int i=0; i<matrix.length; i++){
        //     for(int j=0; j<n; j++){
        //         if(i==j || i+j==n-1){
        //             sum=sum+matrix[i][j];
        //         }
        //     }

        // }

        //-----------------------m2----------------- O(n)

        int n=matrix.length;
        for(int i=0; i<n; i++){
            //pd 
            sum += matrix[i][i];
            //sd
            if(i != n-1-i){
                sum += matrix[i][n-1-i];
            }
            
        }
        //---------------------------------------------------

         System.out.println(sum);
    }

    public static void main(String[] args) {
       
         Scanner sc = new Scanner(System.in);

         int n=sc.nextInt();

        int matrix[][]= new int[n][n];

        int str=1;

        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                matrix[i][j]=str;
                str++;
            }
        }

         for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                
                System.out.print(matrix[i][j] +" ");
                
                
            }
            System.out.println();
        }


        diagSum(matrix);
    }
    
}
