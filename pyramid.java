import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N,row,col;
        N = sc.nextInt();
        for(row=1;row<=N;row++)
        {
            for(col=1;col<=N-row;col++){
                // if(col<=N-row)
                System.out.print(" ");
            }
            for(col=1;col<=(row*2-1);col++){
                // else
                System.out.print("*");
                
            }
            System.out.println();
        }
    }
}
