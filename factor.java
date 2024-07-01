import java.util.*;
public class Intro{
    public static void main(String args[]){
        int N,prod =1,num;
        Scanner input = new Scanner (System.in);
       N = input.nextInt();
       for(num = N;num>=1;num--){
          prod =  prod * num;
       }
       System.out.print(prod);
    }
 }
