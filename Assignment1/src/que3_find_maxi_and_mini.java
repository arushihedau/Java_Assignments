import java.util.Scanner;
public class que3_find_maxi_and_mini {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int maxi=Integer.MIN_VALUE;
        int mini=Integer.MAX_VALUE;
        int[]arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            maxi=Math.max(maxi,arr[i]);
            mini=Math.min(mini,arr[i]);
        }
        System.out.println("Maximum : "+maxi);
        System.out.println("Minimum : "+mini);


    }
}
