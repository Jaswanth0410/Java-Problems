//Without Nested IF
import java.util.*;
public class Intro {
    public static void main(String[] args) {
        int year;
        Scanner input = new Scanner(System.in);
        year = input.nextInt();
        if(year%4 ==0 && (year%100!=0 || year%400==0) )
        System.out.printf("Leap");
        else
        System.out.printf("Not leap");
     }
    }
