import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
        long dig,res=0,pv=1;
        while(num/pv!=0){
            dig = (num/pv)%10;
            res = res*10+dig;
            pv = pv*10;
         }
         if(res==num)
         System.out.println("Yes");
         else
         System.out.println("NO");
    }
}
