import java.util.*;
public class que6_count_pos_neg_zero {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]arr=new int[n];
        int pos=0;
        int neg=0;
        int zero=0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            if(arr[i]==0)zero++;
            else if(arr[i]>0)pos++;
            else neg++;
        }
        System.out.println("Positive : "+pos);
        System.out.println("Negative : "+neg);
        System.out.println("Zero : "+zero);

    }
}
