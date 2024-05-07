package ARRAYS_2D;

import java.util.Scanner;

public class Basics {

    public static boolean check(int matrix[][], int key){

        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(matrix[i][j]==key){
                    System.out.println("key founded at position : "+"("+i+","+j+")");
                    return true;
                }
            }
        }

        System.out.println("key not founded at any position.");
        return false;

    }

    public static void main(String[] args) {

        int matrix[][]=new int[3][3];
        int key;

        Scanner sc = new Scanner(System.in);

         for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                matrix[i][j]=sc.nextInt();
            }
        }

         for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        
        System.out.println(check(matrix,5));
        
        
    }
    
}