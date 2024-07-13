import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N  = sc.nextInt();
        int row,col,diff;
        for(row=1;row<=N;row++){
            int val=row;
            diff=N-1;
            for(col=1;col<=row;col++){
                System.out.print(val+" ");
                val=val+diff;
            }
            System.out.println();
        }
    }
}
