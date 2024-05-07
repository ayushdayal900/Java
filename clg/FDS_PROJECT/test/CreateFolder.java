package test;

    import java.io.File;  
    import java.util.Scanner;  
    public class CreateFolder {  
        //Main() method start  
        public static void main(String args[]) {      

          //Using Scanner class to get the path from the user where he wants to create a folder.  
          System.out.println("Path name: ");  
          Scanner sc = new Scanner(System.in);  
          String path = sc.next();  

          //Using Scanner class to get the folder name from the user  
          System.out.println("Folder name: ");  
          path = path+"/"+sc.next();  

          //Instantiate the File class   
          File f1 = new File(path);  

          //Creating a folder using mkdir() method  
            boolean bool = f1.mkdir();  

          if(bool){  
             System.out.println("Folder is created successfully");  
          }else{  
             System.out.println("Error Found!");  
          }  
       }  
    }  