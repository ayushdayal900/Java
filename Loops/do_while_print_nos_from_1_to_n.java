package Loops;

import java.util.*;
public class do_while_print_nos_from_1_to_n {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int range = sc.nextInt();
        int counter = 1;
        do {
            System.out.print("hello ayush " + counter + " __ ");
            counter++;
        } while (counter<=range);
    }    
}
