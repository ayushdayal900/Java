import java.util.Arrays;
import java.util.Comparator;

public class FractionalKnapsack {
    public static void main(String[] args) {
        
        int val[] = {60,100,120};
        int wgt[] = {10,20,30};
        
        double ratio[][] = new double[val.length][2];
        //0th col = idx
        //1st col = ratio

        for(int i=0; i<val.length; i++){
            ratio[i][0] = i;
            ratio[i][1] = val[i]/(double)wgt[i];
        }

        //sorting in ascending order
        Arrays.sort(ratio, Comparator.comparingDouble(o->o[1]));
        int cap=50;
        int finalValue = 0;

        for(int i=ratio.length-1; i>=0; i--){
            int indx = (int)ratio[i][0];
            if(cap>=wgt[indx]){
                finalValue += val[indx];
                cap = cap-wgt[indx];
            }else{
                finalValue += ratio[i][1]*cap;
                cap =0;
                break;
            }
        }

        System.out.println(finalValue);
    }
}
