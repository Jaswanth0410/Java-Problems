import java.util.*;
public class Intro{
    public static void main(String args[]){
        Scanner input = new Scanner (System.in);
        int N,sum=0,num;
        N = input.nextInt();
        for(num=2;num<=N*2;num+=2){
            sum = sum + num;
        }
        System.out.print(sum);
    }
}
