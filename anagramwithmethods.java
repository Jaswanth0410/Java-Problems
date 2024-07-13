import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num1,num2;
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        int res1=CheckAnagram(num1);
        int res2=CheckAnagram(num2);
        if(res1==res2)
        System.out.println("ANAGRAM");
        else
        System.out.println("Not");
    }
    static int CheckAnagram(int num)
    {
        int res=0;
        int dig;
        while(num!=0){
            dig=num%10;
            res = dig*(10^dig)+res;
            num/=10;
        }
        return res;
    }
}
