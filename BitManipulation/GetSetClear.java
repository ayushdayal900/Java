package BitManipulation;

public class GetSetClear {

    public static int fastExpo(int a, int n){
        int ans=1;
        while(n>0){
            if((n&1)!=0){ //check lsb
                ans = ans*a;
            }
            a=a*a;
            n=n>>1;
        }
        return ans;
    }

    public static int countSetBits(int n){

        int count=0;
        while(n>0){
            if((n & 1) !=0){// ceck lsb
                count++;
            }
            n=n>>1;
        }
     return count;

    }

    public static boolean powerOf2(int n){
        return (n&(n-1))==0;
    }

    public static int clearIBits(int n, int i){
    int bitmask=(~0)<<i;
    return n&bitmask;

    }

    public static int clearBitsRange(int n, int i, int j) {
        int a = ((~0) << (j + 1));
        int b = (1 << i) - 1;
        int bitmask = a | b;
        return n & bitmask;
    }

    public static int updateIthBit(int n, int i, int newBit) {
        // ------------m1---------------
        if (newBit == 0) {
            clearIthBit(n, i);
        } else {
            setIthBit(n, i);
        }
        // ------------m2---------------
        n = clearIthBit(n, i);
        int bitmask = newBit << i;
        return (bitmask | n);
    }

    public static int clearIthBit(int n, int i) {
        int bitmask = ~(1 << i);
        return ((n & bitmask));
    }

    public static int setIthBit(int n, int i) {
        int bitmask = (1 << i);
        return (n | bitmask);
    }

    public static int getIthBit(int n, int i) {
        int bitmask = (1 << i);

        if ((n & bitmask) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public static void main(String[] args) {
        System.out.println("Ith bit is : "+getIthBit(10,3));
        // System.out.println(setIthBit(10,2));
        // System.out.println(clearIthBit(10,1));
        // System.out.println(updateIthBit(10,1,0));
        // System.out.println(clearBitsRange(10,2,4));
        // System.out.println(clearIBits(10,2));
        // System.out.println(powerOf2(15));
        // System.out.println(countSetBits(16));
        // System.out.println(fastExpo(5,3));
    }
}
