import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String res = new String();
        int  ind,count=0;
        for(ind=0;ind<str.length();ind++){
            if(!(str.charAt(ind)>='A'&& str.charAt(ind)<='Z'|| str.charAt(ind)>='a'&& str.charAt(ind)<='z'||str.charAt(ind)>='0'&& str.charAt(ind)<='9'))
            
            count++;
        }
        System.out.println(count);
    }
}
