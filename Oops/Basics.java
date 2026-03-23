package Oops;

public class Basics {
    public static void main(String[] args) {

        Pen p = new Pen();
        p.setColour("blue");
        System.out.println(p.getColor());

        // p.colour="white";
        // System.out.println(p.colour);

        p.setTip(5);
        System.out.println(p.getTip());

        // p.tip=3;
        // System.out.println(p.tip);

        BankAccount b = new BankAccount();
        b.usrName("ayush");
        System.out.println(b.userName);

        b.usrPassword("ayush@123");

    }
}

class BankAccount {

    public static String userName;
    private static String password;

    
    public static void usrName(String name){
        userName=name;
    }

    public static void usrPassword(String pass){
        password=pass;
        System.out.println(password);
    }

}

class Pen {

    private String colour;
    private int tip;

    void setColour(String newColour){   //setters
        colour=newColour;
    }

    void setTip(int newTip){            //setters
        tip=newTip;
    }

    String getColor(){          //getters
        return this.colour;
    }

    int getTip(){               //getters
        return this.tip;
    }

    



}
