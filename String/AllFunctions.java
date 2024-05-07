package String;

import java.util.*;

/**
 * AllFunctions
 */
public class AllFunctions {

    public static void main(String[] args) {
        
        String str1 = "ayush";
        String str2 = "dayal";
        String str3 = "hello ayush dayal";
        String str4 = "   I Am Mr. Blue   ";

        System.out.println();

        //---------------- LENGTH ------------------------------
        System.out.println("length of string : "+str1.length());

        //---------------- SUBSTRING ---------------------------
        System.out.println("substring(1) : "+str1.substring(1) );
        System.out.println("substring(2) : "+str1.substring(1, 3));

        //---------------- CONCANATE ---------------------------
        System.out.println("concatination : "+str1.concat(str2));

        //---------------- INDEX OF 1ST OCCURENCE --------------
        System.out.println();
        System.out.println("index of 1st occurence(1): "+str3.indexOf("ayush"));

        //---------------- INDEX OF 1ST OCCURENCE FROM ith INDEX-----
        System.out.println("index of 1st occurence(2): "+str3.indexOf("ya", 9));

        //---------------- LAST OCCURENCE OF CHARACTER IN STRING ---------------------
        System.out.println("last occurence of char l : "+str3.lastIndexOf("l"));

        //---------------- EQUATING TWO STRINGS -----------------------
        System.out.println();
        System.out.println("equal or not (case sensitive): "+str3.equals("hello ayush daya"));
        System.out.println("equal or not ( -ignore case ): "+str3.equalsIgnoreCase("Hello Ayush Dayal"));

        //---------------- COMPARE TWO STRINGS ------------------------
        //  s1.compareTo(s2);
        //  This returns difference s1-s2. If :
        //  out < 0 -------> s1 comes before s2
        //  out = 0 -------> s1 and s2 are equal.
        //  out > 0 -------> s1 comes after s2.
        System.out.println();
        System.out.println("comparing 2 strings     : "+str3.compareTo(str1));
        System.out.println("comparing 2 strings (-i): "+str3.compareToIgnoreCase(str1));

        //---------------- conversion to lower/upper case-------------------
        System.out.println();
        System.out.println("to lowercase : "+str4.toLowerCase());
        System.out.println("to uppercase : "+str4.toUpperCase());

        //---------------- remove whitespaces ---------------------------
        System.out.println("remove white spaces : "+str4.trim());

        //---------------- REPLACE CHARACTER/STRING IN MAIN STRING ----------------------------
        System.out.println();
        System.out.println("replace all characters in string : "+str3.replace("a", "Z"));
        System.out.println("replace all characters in string : "+str3.replace("ayush", "shrirang"));

        //---------------- CHECK CONTAINS OR NOT ------------------------
        System.out.println();
        System.out.println("is ayush contains in str3? : "+str3.contains(str1));
        System.out.println("is dayal contains in str3? : "+str3.contains(str2));

        //---------------- CONVERT STRING TO CHAR ARRAY ------------------
        System.out.println();
        char[] c = str1.toCharArray();

        System.out.print("value of char Array : ");

            for(int i=0; i<str1.length(); i++){
                System.out.print(c[i] + " ");
            }
        System.out.println();    
        
        String s="";
        System.out.println("value of char array : "+s.valueOf(c));
        System.out.println("value of char array : "+s.copyValueOf(c));

        //---------------- STARTS WITH -----------------------------------
        System.out.println("is str3 starts with hello? : "+str3.startsWith("hello"));





    }
}

