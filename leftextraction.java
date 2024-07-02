import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        long num,res=0,prev=1;
        while(true){
            num = sc.nextLong();
            if(num == -1)
            break;
            
            res = num*prev+res;
            prev = prev*10;
            System.out.printf("%d %d\n",num,res);
        }
    }
}
