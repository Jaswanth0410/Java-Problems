import java.util.*;
public class Intro{
    public static void main(String args[]){
       long N,fact;
       Scanner input = new Scanner(System.in);
       N = input.nextLong();
       for(fact=1;fact<=N/2;fact++){
           if(N%fact ==0){
               System.out.print(fact+" ");
           }
    }
    }
}
