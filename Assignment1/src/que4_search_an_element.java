import java.util.*;
public class que4_search_an_element {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int x=sc.nextInt();
        int ind=-1;
        for(int i=0;i<n;i++){
            if(arr[i]==x){
                ind=i;
                break;
            }
        }
        System.out.println("Index : "+ind);

    }
}
