import java.util.Scanner;
public class que1_array_sum_and_average {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int total=0;
        int[]arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            total+=arr[i];
        }
        double average=(double)total/n;
        System.out.println("Total : "+total);
        System.out.printf("Average :%.2f",average);
        
    }
}
