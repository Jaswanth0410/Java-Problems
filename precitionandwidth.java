// Get input from the user - precision and width
import java.util.*;
public class Intro{
    public static void main(String args[]){
        // int num =1234;
        // System.out.printf("%15d",num);
        float num;
        int prec,width;
        Scanner input = new Scanner(System.in);
        num = input.nextFloat();
        width = input.nextInt();
        prec =  input.nextInt();
        System.out.printf("%"+width+"."+prec+"f",num);
    }
}
