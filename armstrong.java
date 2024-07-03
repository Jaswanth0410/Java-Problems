//Armstrong Number
import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num,count =0,safe=0,dig,itr,sum=0,power;
        num  = sc.nextInt();
        safe = num;
        while(num!=0){
            count ++;
            num/=10;
        }
        num = safe;
        while(num!=0){
        dig = num%10;
        for(power=1,itr= 1;itr<=count;itr++){
            power = power  * dig;
            }
        sum = sum+power;
        num = num/10;
        }
        if(safe == sum){
            System.out.print("Armstrong");
        }
        else{
            System.out.print("Not");
        }
    }
}
