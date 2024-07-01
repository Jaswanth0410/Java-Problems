//Minimum number used to make the number as a perfect square
import java.util.*;
public class Main{
public static void main(String[] args) {
        long N,fact,res=1;
        Scanner sc = new Scanner(System.in);
        N=sc.nextLong();
        for(fact =2;N!=1;fact++){
            int count  = 0;
            while(N%fact==0){
                // System.out.print(fact+" ");
                count++;
                N=N/fact;
            }
            if(count%2==1)
            res= res*fact;
        }
        System.out.print("Divisor "+res);
        
    }
}
