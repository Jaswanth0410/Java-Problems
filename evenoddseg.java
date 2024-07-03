//Even-Odd Segregation
import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num,dig,epv=1,opv=1,even=0,odd=0,res;
        num= sc.nextInt();
        while(num!=0){
        dig = num%10;
        if(dig%2==0){
           even =  dig*epv+even;
           epv= epv*10;
        }
        else{
            odd = dig*opv+odd;
            opv= opv*10;
        }
        num = num/10;
    }
    res = even * opv + odd;
    System.out.print(res);
    }
}
