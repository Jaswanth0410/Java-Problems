import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N  = sc.nextInt();
        int row,col,start,val;
        for(row=0;row<N;row+=2){
             val=N*row+1;  
            for(col=1;col<=N;col++){
                System.out.print(val+" ");
                val++;
            }
            System.out.println();
        }
        start=(N/2)*2-1;
        for(row=start;row>=1;row-=2){
            val = N*row+1;
            for(col=1;col<=N;col++){
                System.out.print(val+" ");
                val++;
            }
            System.out.println();
        }
    }
}
