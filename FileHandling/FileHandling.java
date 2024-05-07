
package java.FileHandling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

/**
 * ClothingIndustry
 */
public class FileHandling {

    public static void main(String[] args) {
        //  ---------------------Code to create a new file---------------------
       String s1 = "f1.txt";
       File myFile = new File("f1.txt");
       try {
           myFile.createNewFile();
       } catch (IOException e) {
           System.out.println("Unable to creat this file");
           e.printStackTrace();
       }

        //--------------- Code to write in file --------------------------
       try {
           FileWriter fw = new FileWriter("f1.txt");
           fw.write("Hello World \n ok by");
           fw.close();
       } catch (IOException e) {
           throw new RuntimeException(e);
       }

        // ------------- Code to read a file -------------------------------
        File fr = new File("f2.txt");
        try {
            Scanner sc = new Scanner(fr);
            while(sc.hasNextLine()){
                String line = sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        
        //------------------ Appending text in file -----------------------
        String s ="11111111111";
        try {
            Files.write(Paths.get("f1.txt"), s.getBytes(), StandardOpenOption.APPEND);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }



        //----------------- deleting a file -------------------------------
        File del = new File("f2.txt");
        if(del.delete()){
            System.out.println("successfully deleated the file "+del.getName());
        }
        else{
            System.out.println("some problem occured while deleting the file");
        }


    }
}