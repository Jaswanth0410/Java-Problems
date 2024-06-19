// Get input from the user - precision
import java.util.*;
public class Intro{
    public static void main(String args[]){
        // int num =1234;
        // System.out.printf("%15d",num);
        int num,prec;
        Scanner input = new Scanner(System.in);
        num = input.nextInt();
        prec = input.nextInt();
        System.out.printf("%."+prec+"d",num);
    }
}
