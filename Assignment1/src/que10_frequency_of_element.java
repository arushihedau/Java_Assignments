import java.util.*;
public class que10_frequency_of_element {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Map<Integer,Integer>mpp=new HashMap<>();
        for(int ele:arr){
            mpp.put(ele,mpp.getOrDefault(ele,0)+1);
        }
        for(int ele:arr){
            if(mpp.containsKey(ele)){
                System.out.println("Element: "+ele+" Frequency: "+mpp.get(ele));
                mpp.remove(ele);
            }
            else continue;
        }

    }
}
