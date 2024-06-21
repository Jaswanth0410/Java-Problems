//CasCading If
import java.util.*;
public class Intro {
    public static void main(String[] args) {
        int num;
        Scanner input = new Scanner(System.in);
        num = input.nextInt();
        if(num%3 ==0){
              System.out.print("Foo");
        }
        if(num%5 == 0){
                    System.out.print("Bar");
        }       
    }
}
