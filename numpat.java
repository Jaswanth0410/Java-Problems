import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        long N  = sc.nextLong();
        int row,col,val=1;
        for(row=1;row<=N;row++){
            for(col=1;col<=row;col++){
                System.out.print(val+" ");
                val=val+1;
            }
            System.out.println();
        }
    }
}
