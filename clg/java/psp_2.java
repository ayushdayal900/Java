package clg;

public class psp_2 {
    public static void main(String args[]) {

        int a[][] = { { 1, 1, 1 }, { 2, 2, 2 }, { 3, 3, 3 } };
        int b[][] = { { 1, 1, 1 }, { 2, 2, 2 }, { 3, 3, 3 } };

        int ans[][] = new int[3][3]; 

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                ans[i][j] = 0;
                for (int k = 0; k < 3; k++) {
                    ans[i][j] += a[i][k] * b[k][j];
                } 
                System.out.print(ans[i][j] + " "); 
            } 
            System.out.println();
        }
    }
}


