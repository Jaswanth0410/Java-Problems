import java.util.*;
public class Intro{
    public static void main(String args[]){
        // Scanner input = new Scanner (System.in);
        int num = 1024;
        for(; num!=0 ;num>>=1){
            System.out.print(num+" ");
        }
    }
}
