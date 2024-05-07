package test;

// import java.io.BufferedWriter;
import java.io.File;
// import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Map.Entry;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
// import java.util.List;
import java.util.Queue;
import java.util.Scanner;
// import java.util.Set;
import java.util.Stack;

public class Functions {

    static Scanner sc = new Scanner(System.in);
    static HashMap<String, Integer> hm = new HashMap<>();
    static ArrayList<Integer> al = new ArrayList<>();
    static Queue<Integer> q = new LinkedList<>();

    // ----------------- file creation -----------------------
    public static void createNewFile() {
        File myFile = new File("DataBase.txt");
        try {
            myFile.createNewFile();
        } catch (IOException e) {
            System.out.println("Unable to creat this file");
            e.printStackTrace();
        }
    }

    // ---------------- file writing ----------------------
    public static void wr(String s) {
        try {
            Files.write(Paths.get("DataBase.txt"), "\n".getBytes(), StandardOpenOption.APPEND);
            Files.write(Paths.get("DataBase.txt"), s.getBytes(), StandardOpenOption.APPEND);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    // ---------------- new user----------------------------
    public static void newUser(boolean nu) {
        if (nu) {
            String name;
            int dist;

            System.out.println();
            System.out.println("----- Welcome To Clothing Industry -----");
            System.out.print("Enter your name : ");
            name = sc.next();
            wr("\nName : " + name);

            System.out.print("Enter Distance from Industry to Your Home (in km) : ");
            dist = sc.nextInt();

            // hashmap have name and distance as key value pair
            hm.put(name, dist);
        }

        else {
            System.out.println();
            System.out.println("------Continue Adding------");
        }

        clothList();
    }

    // ---------- cloth list function -------------------------
    public static void clothList() {

        System.out.println("\n1.Pants\t\t2.Shirts\t3.Sweater\t4.Hoodies\t5.Skirt");
        int choice = 0;

        choice = sc.nextInt();
        switch (choice) {
            case 1:
                wr("Order : " + "for pants");
                break;
            case 2:
                wr("Order : " + "for Shirts");
                break;
            case 3:
                wr("Order : " + "for Sweater");
                break;
            case 4:
                wr("Order : " + "for Hoodies");
                break;
            case 5:
                wr("Order : " + "for Skirt");
                break;
            default:
                System.out.println("invalid input");
                break;
        }
    }

    // ------------------ HashMap to array list ------------------------------
    public static void printHm() {

        for (String key : hm.keySet()) {
            // System.out.println(key + ": " + hm.get(key));
            al.add(hm.get(key));
        }
    }

    // ------------------ 3 stacks for sorting --------------------------------
    public static void SortByThreeStacks() {

        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        Stack<Integer> stack3 = new Stack<>();

        for (int i = 0; i < al.size(); i++) {
            stack1.push(al.get(i));
        }

        while (!stack1.isEmpty()) {
            if (stack2.isEmpty()) {
                stack2.push(stack1.pop());
            } else {
                if (stack2.peek() >= stack1.peek()) {
                    stack2.push(stack1.pop());
                } else {
                    while (!stack2.isEmpty() && (stack2.peek() < stack1.peek())) {
                        stack3.push(stack2.pop());
                    }
                    stack2.push(stack1.pop());
                    while (!stack3.isEmpty()) {
                        stack2.push(stack3.pop());
                    }
                }
            }
        }

        while (!stack2.isEmpty()) {
            q.add(stack2.pop());
        }
    }

    // ----------------- return clothes by queue ----------------------------
    public static void revert() {
        // int value = 0;

        // iterate each entry of hashmap
        for (Entry<String, Integer> entry : hm.entrySet()) {
            for (int dist : hm.values()) {
                if (entry.getValue() == dist) {
                    System.out.println("The key for value " + dist + " is " + entry.getKey());
                }
            }
        }

    }

}
