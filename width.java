// Get input from the user - width
import java.util.*;
public class Intro{
    public static void main(String args[]){
        // int num =1234;
        // System.out.printf("%15d",num);
        int num,width;
        Scanner input = new Scanner(System.in);
        num = input.nextInt();
        width = input.nextInt();
        System.out.printf("%"+width+"d",num);
    }
}
