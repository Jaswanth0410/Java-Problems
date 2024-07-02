import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        //2147483647
        long num,fact,range;
        num = sc.nextLong();
        range =(int) Math.sqrt(num);
        for(fact=2;fact<=range;fact++){
            if(num%fact==0)
            {
            System.out.println("Not Prime");
            break;}
        }
        if(fact>range)
        System.out.println("Yes");
    }
}
