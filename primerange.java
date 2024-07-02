import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int limit = sc.nextInt();
        int range = (int)Math.sqrt(num);
        for(int num = 2;num<=limit;num++){
            if(num%2==0 && num!=2)
            continue;
        
        else if(num%6==1||num%6==5||num==2||num==3){
            range = (int)Math.sqrt(num);
            for(fact=3;fact<=range;fact+=2){
                if(num%fact==0)
                break;
            }
            if(fact>range){
                System.out.print(num+=" ");
            }
        }
        }
    
