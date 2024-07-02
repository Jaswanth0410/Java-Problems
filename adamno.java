import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N  = sc.nextInt();
        int sqr1,sqr2,dig,rev1=0,rev2=0;
        sqr1=N*N;
        while(N!=0){
            dig = N%10;
            rev1=rev1*10+dig;
            N/=10;
        }
        sqr2 = rev1*rev1;
        while(sqr2!=0){
            dig=sqr2%10;
            rev2=rev2*10+dig;
            sqr2/=10;
        }
        if(sqr1 == rev2)
            System.out.print("Adam");
        else
        System.out.print("Not");
    }
}
