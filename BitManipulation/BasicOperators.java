package BitManipulation;

public class BasicOperators {
    public static void main(String[] args) {
    //------------------And-----------------------
    System.out.println((5 & 6)); //0001

    //------------------OR-----------------------
    System.out.println((5 | 6)); //0111

    //------------------XOR-----------------------
    System.out.println((5 ^ 6)); //0110

    //--------------1's compiement----------------
    System.out.println(~5);  // basically  5->00000101
    System.out.println(~0);  // not gate  ~5->11111010
                             //            1s compli -> 00000101
                             //            2s compli -> 00000101 +1 =00000110
                             //             =6 now add minus (-6)
    //-------------left shift <<------------------
    System.out.println(5<<2);

    //-------------right shift <<------------------
    System.out.println(6>>1);
 }
}
