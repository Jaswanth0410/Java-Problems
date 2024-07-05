import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int dig;
        while(num!=0)
        {
           int  pv = 1;
            int cons =0;
        while(num/pv!=0)
        {
         dig= (num/pv)%10;
         if(dig > 0){
            cons = 1*pv+cons;
         }
         else{
            cons = 0*pv+cons;
            // num=num/10;
         }
         pv=pv*10;
        }
         num = num - cons;
         if(num==0){
         System.out.println(cons);}
         else{
         System.out.println(cons+"+");}
        }
    }
}
