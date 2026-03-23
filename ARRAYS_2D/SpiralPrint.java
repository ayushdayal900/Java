package ARRAYS_2D;


import java.util.Scanner;
//using namespace std;

 

public class SpiralPrint {

                                                                               
public static void spiral(int matrix[][]){

    int startRow=0;
    int endRow=matrix[0].length-1;
    int startCol=0;
    int endCol=matrix[0].length-1 ;

    while(startRow<=endRow && startCol<=endCol) {
        //top
        for(int j=startCol; j<=endCol; j++){
            System.out.println(matrix[startRow][j]+" ");
        }

        //right
        for(int i=startRow+1; i<=endRow; i++){
            System.out.println(matrix[i][endCol]+" ");
        }

        //bottom
        for(int j=endCol-1; j>=startCol; j--){
            if(startRow==endRow)    { break;}
            System.out.println(matrix[endRow][j]+" ");
        }

        //left
        for(int i=endRow-1; i>=startRow+1; i--){
            if(startCol==endCol)    { break;}
            System.out.println(matrix[i][startCol] );
        }

        startRow++;
        endRow--;
        startCol++;
        endCol--;
    }
    System.out.println();
}

    public static void main(String[] args) {
        
         int matrix[][]=new int[4][4];
         Scanner sc = new Scanner(System.in);

         for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                matrix[i][j]=sc.nextInt();
            }
         }
        spiral(matrix);

    }

}
