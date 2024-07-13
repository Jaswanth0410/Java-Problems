import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int size= sc.nextInt();
        int[] arr = new int[size];
        int ind,e_ind,safe,shift;
        for(ind =0;ind<size;ind++){
            arr[ind]=sc.nextInt();
        }
        for(ind=0;ind<size;ind++){
            while(arr[ind]%2==0)
            ind++;
            for(e_ind=ind+1;e_ind<size && arr[e_ind]%2!=0;e_ind++);
                if(e_ind==size)
                break;
                safe=arr[e_ind];
                for(shift=e_ind-1;shift>=ind;shift--)
                    arr[shift+1]=arr[shift];
                    arr[ind]=safe;               
            }
        for(ind=0;ind<size;ind++){
            System.out.print(arr[ind]+" ");
        }
        }
        }
    
Bubble sort
import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int size= sc.nextInt();
        // int ind,temp;
        int[] arr = new int[size];
        int ind,temp=0,flag=0;
        for(ind =0;ind<size;ind++){
            arr[ind]=sc.nextInt();
        }
            for(int itr=0;itr<size;itr++)
            {
                
            for(flag=0,ind=0;ind<(size-1-itr);ind++)
            {
                if(arr[ind]>arr[ind+1])
                temp = arr[ind];
                arr[ind] = arr[ind+1];
                arr[ind+1]=temp;
                flag=1;
             }
            
            if(flag==0)
            break;
            }
            for(ind=0;ind<size;ind++)
        System.out.printf(arr[ind]+" ");
        }
}
