import java.util.*;
public class Main{
    public static void main(String args[]){
        int size,ind,sum=0;
        Scanner sc = new Scanner(System.in);
        size= sc.nextInt();
        int[] arr = new int[size];
        for(ind =0;ind<size;ind++){
            arr[ind]=sc.nextInt();
        }
        for(ind=0;ind<size;ind++){
            sum = sum+arr[ind];
            System.out.print(arr[ind]+" ");           
        }
        System.out.println(sum);
    }
}
