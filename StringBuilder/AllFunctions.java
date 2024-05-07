package StringBuilder;

public class AllFunctions {
    public static void main(String[] args) {
        // ------------------ SB Constructors -----------------------------------

            //--------------------default-----------------------------

            System.out.println();
            StringBuilder sb0 = new StringBuilder();
            sb0.append("abcdefg");
            System.out.println("print appended string : "+sb0);
            //--------------------capacity-----------------------------
            
            StringBuilder sb2 = new StringBuilder( 10000000);
            System.out.println("capacity of SB : "+sb2.capacity());
            
            //--------------------charsequence-----------------------------
            StringBuilder sb1 = new StringBuilder("ayush dayal");
            sb1.append(" is me");
            System.out.println("Charsequence in Sb : "+sb1);
            
            //--------------------string----------------------------
            String s = "asdfghjkl;";
            StringBuilder sb3 = new StringBuilder(s.toString());
            System.out.println("string3 = "+sb3.toString());

            
        //------------------- SB Functions -------------------------------------------
        StringBuilder sb = new StringBuilder(10);

        System.out.println();
        sb.append("ayush");
        System.out.println("append char : "+sb);
        System.out.println("Capacity : "+sb.capacity());
        System.out.println("append char : "+sb.charAt(0));
        System.out.println("Unicode : "+sb.codePointAt(1));
        System.out.println("Unicode before : "+sb.codePointBefore(1));
        System.out.println("Unicode count  : "+sb.codePointBefore(1));

        System.out.println();
        sb.delete(1, 3);
        System.out.println("delete range : "+sb);
        sb.deleteCharAt(0);
        System.out.println("after deleting char at 0 : "+sb);
        sb.ensureCapacity(0);//RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR

        char ch[] = new char[2];
        sb.getChars(0, 2, ch, 0);//RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR
        System.out.println("get chars src->dest : "+ch.toString());
        System.out.println("getting index of s : "+sb.indexOf("h"));
        System.out.println("inserting aa at position 0 : "+sb.insert(0, "aa"));
        System.out.println("Last Index of a : "+sb.lastIndexOf("a"));
        System.out.println("Length of sb : "+sb.length());
        System.out.println("replace : "+sb.replace(0, 11, "ayush dayal"));
        System.out.println("reverse : "+sb.reverse());
        sb.reverse();

        System.out.println();
        sb.setCharAt(0, 'A');
        sb.setLength(6);
        System.out.println("setting character at pos i : "+sb);
        System.out.println("substring (name): "+sb.substring(0,5));
        System.out.println("to string : "+sb.toString());

        sb.trimToSize();//RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR
        System.out.println("size after trim : "+sb.length());
        




        














        


    }
    
}
