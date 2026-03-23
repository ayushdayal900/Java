package ARRAYS_2D;

public class Matrix_multn {
    public static void main(String[] args) {
        
        int matrix1[][]={{10,20,30,40},
                         {15,25,35,45},
                         {27,29,37,48},
                         {32,33,39,50}};


        int matrix2[][]={{10,20,30,40},
                        {15,25,35,45},
                        {27,29,37,48},
                        {32,33,39,50}};


int matrix3[][]=new int[4][4];

        for (int i=0; i<4; i++){
            for (int j = 0; j < 4; j++) {
                matrix3[i][j] += matrix1[i][j]*matrix1[j][i];
            }
        }

System.out.println(matrix3[0][0]);
    }

    
}
