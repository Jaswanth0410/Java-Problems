import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N,row,col;
        N = sc.nextInt();
        for(row=N;row>=1;row--)
        {
            for(col=1;col<=N;col++){
                if(col<=N-row)
                System.out.print(" ");
                else
                System.out.print("*");
            }
            System.out.println();
        }
            
    }
}
