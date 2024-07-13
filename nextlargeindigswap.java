
import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int num,pos,pv,dig,res=0,last;
        num = input.nextInt();
        pos = input.nextInt();
        pv = (int)Math.pow(10,pos);
        last = num%pv;
        while(last!=0){
            dig = last%10;
            res = res*10+dig;
            last/=10;
        }
        num = (num/pv)*pv+res;
        System.out.print(num);
    }
}
