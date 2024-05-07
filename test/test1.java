package test;

import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class test1 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int id[] = new int[5];
        String historyCsv[] = new String[5];
        HashMap<Integer,String> hm = new HashMap<>();

        for(int i=0; i<id.length; i++){
            id[i] = sc.nextInt();
            historyCsv[i] = sc.next();
            hm.put(id[i],historyCsv[i]);
        }

        for(int i=0; i<id.length; i++){
            System.out.println("id = "+id[i]);
            System.out.println("History = "+hm.get(id[i]));
        }


        //--------------- Code to write in file --------------------------
       try {
        FileWriter fw = new FileWriter("DataBase.csv");
        for(int i=0; i<id.length; i++){
            fw.write(id[i]);
            fw.write(hm.get(id[i]));
            fw.write("\n");

        }
        fw.close();
    } catch (IOException e) {
        throw new RuntimeException(e);
    }
        

    }
}