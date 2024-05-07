package test;
import java.util.Scanner;
// import java.io.IOException;
// import java.nio.file.Files;
// import java.nio.file.Paths;
// import java.nio.file.StandardOpenOption;

public class Main {

    public static void main(String[] args) {
        
        boolean newUser = true;
        boolean contnu = true;

        try (Scanner sc = new Scanner(System.in)) {
            //creating a file
            Functions.createNewFile();

   for(int i=0; i<2; i++){
            while(contnu){

                Functions.newUser(newUser);  //new user asil t lihil nahitr nahi

                System.out.println("Want to place more clothes? true/false");
                contnu = sc.nextBoolean();

                if(contnu == true){ newUser = false;    }
                else{newUser = true;}

            }
            contnu = true;
   }
        }

        Functions.printHm();
    Functions.SortByThreeStacks();
    Functions.revert();
    

    }
}