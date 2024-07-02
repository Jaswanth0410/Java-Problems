import java.util.*;
public class Main{
    public static void main(String args[]){
        int num;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        if((num&(num-1))==0){
            System.out.print("Yes");
        }
        else{
            System.out.print("No");
        }
    }
}
