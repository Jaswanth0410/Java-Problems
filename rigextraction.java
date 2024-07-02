import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        long num,res=0;
        while(true){
            num = sc.nextLong();
            if(num == -1)
            break;
            res = res*10+num;
            System.out.printf("%d %d\n",num,res);
        }
    }
}
