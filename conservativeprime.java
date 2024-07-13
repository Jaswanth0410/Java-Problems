
import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int range,num,sum,fact,count=0;
        range = sc.nextInt();
        for(sum=2,num=3;sum<range&&num<range;num++){
            if(isPrime(num)==1)
            {
                sum = sum+num;
                if(isPrime(sum)==1)
                {
                    System.out.print(sum+" ");
                    count++;
                }
            }
        }
        System.out.println(count);
    }
        static int  isPrime(int num)
        {
            int range;
            if(num%2==0&&num!=2)
                return 0;
             if(num==2||num==3)   
             return 1;
             if(num%6!=5&&num%6!=1)
             return 0;
             int fact;
             range = (int)Math.sqrt(num);
             for(fact=3;fact<=range;fact++)
                 if(num%fact==0)
                 return 0;
            return 1;      
             }
            } 
