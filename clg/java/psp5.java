package clg.java;

import java.util.Scanner;

public class psp5 {
    public static void main(String[] args) {

        acc a = new acc("Ayush"); 
        a.userInfo();    
        Roi r = new Roi(10);
        System.out.println("curr balance : "+r.roi());

    } 
}
//---------------------------------------------------------------->>ROI
class Roi extends bank{

    double x ;
    Roi(double x){
        this.x = x/100;
    }

    //---------------------- roi --------------------------
    public double roi(){
        int currBalance = balance();
        System.out.println("expected gain : "+(int)currBalance + (int)(currBalance*0.1));
        return currBalance + currBalance*x;        //10% roi added
        //float n = sc.nextF
    }
}


//------------------------------------------------------------------>> bank
class bank {
     static Scanner sc = new Scanner(System.in);

    static int amount =1000;

    //--------------- balance ------------------------

    public static int balance(){
        System.out.println("Balanced showed");
        return amount;
    }
    // -------------------- deposite ----------------------
    public static int deposite(int x){
        System.out.println("how much amount you want to deposite?");
        int m = sc.nextInt();
        System.out.println("amount deposited");
        System.out.println("Current Balance is : "+(m+balance()));
        return m+balance();
    }

    //----------------------- withdrowl --------------------
    public static int withdrowl(int x){
        System.out.println("how much amount you want to withdrow?");
        int m = sc.nextInt();
        System.out.println("amount withdrow");
        System.out.println("Current Balance is : "+(balance()-m));
        return balance()-m;
    }

    
}
//------------------------------------------------------------->> account
 
class acc extends bank{

    static Scanner sc = new Scanner(System.in);

    static String name;
    acc(String n){
        name = n;
    }

    public static void userInfo(){
        System.out.println("This is "+name+"'s account.");
        System.out.println("Balance : "+balance());

            System.out.println("What is your work at bank?");
            System.out.println("1.Check balance     2.Deposite      3.Withdrow        4.make Fd at 10%");
            int ch = sc.nextInt();

                switch (ch) {
                    case 1: System.out.println(balance());         break;
                    case 2: System.out.println(deposite(100));   break;
                    case 3: System.out.println(withdrowl(100));  break;
                    //case 4: System.out.println(roi());             break;         
                    default:System.out.println("invalid number");  break;
                }

    }


}
