
import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N  = sc.nextInt();
        int sqr1=Square(N);
        int rev1=Reverse(N);
        int sqr2=Square(rev1);
        int rev2=Reverse(sqr2);
        if(sqr1==rev2)
        System.out.println("Adam");
        else
        System.out.println("Not");
    }
    static int Square(int num)
    {
        return num*num;
    }
    static int Reverse(int num)
    {
        int rev=0,dig;
        while(num!=0){
            dig=num%10;
            rev=rev*10+dig;
            num/=10;
        }
        return rev;
    }
}
