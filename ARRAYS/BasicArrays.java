// array basics

package ARRAYS;
import java.util.*;

public class BasicArrays {

    public static void update(int sc[]){
        for(int i=0; i<sc.length; i++){
            sc[i]=sc[i]+1;
        }
    }

    public static void main(String[] args) {
        // decleration
        int mark[] = new int[50];
        int numbers[]= {1,2,3};
        int moreNums[]= {4,5,6};
        
        String fruits[]={"apple","mango"};

        // ip/op in arrays
        Scanner sc = new Scanner(System.in);
        int marks[] =new int[3];
        marks[0]=sc.nextInt();
        marks[1]=sc.nextInt();
        marks[2]=sc.nextInt();

        System.out.println("phy  : "+marks[0]);
        System.out.println("chem : "+marks[1]);
        System.out.println("math : "+marks[2]);

        //adding 1 in element at 0th position
        marks[0]=marks[0]+1;
        System.out.println("new phy : "+marks[0]);

        // percentage
        float per = (marks[0]+marks[1]+marks[2])/3;
        System.out.println("Percentage : "+per +" %");

        // length of array
        System.out.println(marks.length);

        // arrays as a function argument
        int score[]={98,99,97};
        update(score);
        
        // print an array
        for(int i=0; i<score.length; i++){
            System.out.print(score[i]+" ");
        }
        System.out.println();




    }
    
}
