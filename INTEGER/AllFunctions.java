package INTEGER;
import java.util.*;

public class AllFunctions {
    public static void main(String[] args) {

        int n = 123456789;
        String s="12345";

        //--------------- int -> string ----------------------------
        System.out.println();
        System.out.println("check for int -> string : "+Integer.toString(n).charAt(0));

        //--------------- int -> number system --------------------
        System.out.println();
                //----------int -> hex-----------------
                System.out.println("number in hex form    : "+Integer.toHexString(n));

                //----------int -> octal-----------------
                System.out.println("number in octal form  : "+Integer.toOctalString(n));
                
                //----------int -> Binary-----------------
                System.out.println("number in binary form : "+Integer.toBinaryString(n));
            
        //---------------- strin -> int ---------------------
        System.out.println();
        int n1 = Integer.valueOf(s)*10;
        int n2 = Integer.valueOf(s,6)*10;
        int n3 = Integer.parseInt(s)*10;
        int n4 = Integer.parseInt(s,6)*10;

        
        System.out.println("string -> integer : "+n1);
        System.out.println("string -> integer with radix : "+n2);
        System.out.println("string -> integer : "+n3);
        System.out.println("string -> integer with radix : "+n4);
        
        //---------------- 
        System.out.println("getInteger(abcd,10) ="+ Integer.getInteger("abcd", 10));
        
        //------------------- decoding of string ---------------------------------
        System.out.println();
        String decimal = "45";
        String octal = "005";
        String hex = "0x0f";
 
        Integer dec = Integer.decode(decimal);
        System.out.println("decode(45) = " + dec);
        dec = Integer.decode(octal);
        System.out.println("decode(005) = " + dec);
        dec = Integer.decode(hex);
        System.out.println("decode(0x0f) = " + dec);

        //---------------- rotating of binary form-----------------------------
        System.out.println();
        int valrot = 2;
        System.out.println("rotateLeft(0000 0000 0000 0010 , 2) ="+ Integer.rotateLeft(valrot, 2));
        System.out.println("rotateRight(0000 0000 0000 0010,3) ="+ Integer.rotateRight(valrot, 3));

        //------------------------- datatype value -----------------------------
        int num1 = 10;
        int b = 45;
        String bb = "45";
        System.out.println();

        // Construct two Integer objects
        
        // Integer x = new Integer(b);
        Integer x = b;
        Integer y = new Integer(bb);

        System.out.println(x.byteValue());
        System.out.println(y.shortValue());
        System.out.println(x.intValue());
        System.out.println(y.doubleValue());
        System.out.println(x.floatValue());
        System.out.println("Hash code of num1 : "+y.hashCode());
        System.out.println("BitCount in num1 : "+Integer.bitCount(num1));
                
        //---------------------- leading and trailing Zeros ----------------------
        System.out.println();
        int num2 = 10;
        System.out.println("Leading  Zeros : "+Integer.numberOfLeadingZeros(num2));     //32 - highest bit position from index 1
        System.out.println("Trailing Zeros : "+Integer.numberOfTrailingZeros(num2));    // ending zeros
        System.out.println("Highest 1 Bit : "+Integer.highestOneBit(num2));
        System.out.println("Lowest 1 Bit : "+Integer.lowestOneBit(num2));

        //---------------------- comparing string no. with int no.------------------
        System.out.println();
        System.out.println("Equals : "+x.equals(y));    //return T/F
        System.out.println("comparing f()1 : "+x.compareTo(y));             // return T(0)/F(1)
        System.out.println("comparing f()2 : "+Integer.compare(x,y));       // return T(0)/F(1)
        System.out.println("signum : "+Integer.signum(x));  // 1 : x>0 || -1 : x<0 || 0 : x=0
        System.out.println("Compare Unsigned : "+Integer.compareUnsigned(x, y));

        System.out.println("reverse : "+Integer.reverse(b));
        System.out.println("reverse bytes : "+Integer.reverseBytes(b));






    }

}
