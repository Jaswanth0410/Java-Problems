import java.util.*;
public class Main{
public static void main(String[] args) {
        long N,fact;
        Scanner sc = new Scanner(System.in);
        N=sc.nextLong();
        for(fact =2;N!=1;fact++){
            while(N%fact==0){
                System.out.print(fact+" ");
                N=N/fact;
            }
        }
        System.out.println();
    }
}
