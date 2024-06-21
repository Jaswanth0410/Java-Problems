//Nested If
import java.util.*;
public class Intro {
    public static void main(String[] args) {
        int year;
        Scanner input = new Scanner(System.in);
        year = input.nextInt();
        if(year%4 ==0)
        {
            if(year%100 ==0)
            {
                if(year%400 ==0)
                    System.out.printf("Leap");
                else
                    System.out.printf("Not Leap");
            }else
            System.out.printf("Leap");
        }else
        System.out.printf("Not Leap");
     }
    }
