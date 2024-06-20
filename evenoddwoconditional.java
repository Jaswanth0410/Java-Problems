import java.util.*;
public class Intro {
    public static void main(String[] args) {
        int num;
        Scanner input = new Scanner(System.in);
        num = input.nextInt();
        if((num&1)==0){
            System.out.printf("Even");
        }
        else{
            System.out.printf("Odd");
        }
        System.out.println();
    }
}
