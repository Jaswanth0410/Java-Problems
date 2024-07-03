import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
        long dig,res=0;
        while(num!=0){
            dig = num % 10;
            res = res*10+dig;
            num = num/10;
        }System.out.println(res);
    }
}
