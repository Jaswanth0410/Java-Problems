import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int hcf=0,fact,min;
        min = (num1<num2)?num1:num2;
        for(fact=1;fact<=min;fact++)
        {
            if(num1%fact==0 && num2%fact==0){
                hcf = fact;
            }
        }
        System.out.print(hcf);
    }
}
