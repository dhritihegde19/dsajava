import java.util.*;
public class Missing{
    public static void main(String[] args){
        List<Integer> invoices=Arrays.asList(8,10,3,1,4,2,5);
        int mini=Collections.min(invoices);
        while(true){
            int current=mini+1;
            if(invoices.contains(current))
                mini=current;
            else{
                System.out.println("Minimum missing value is "+current);
                return;
            }
        }

    }
}