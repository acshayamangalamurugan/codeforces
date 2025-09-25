import java.util.*;
public class VanyaAndFence{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int h=sc.nextInt();
        int[] height=new int[n];
        for (int i=0;i<n;i++){
            height[i]=sc.nextInt();
        }
        int width=0;
        for (int j=0;j<n;j++){
            if (height[j]<=h){
                width+=1;
            }
            else{
                width+=2;
            }
        }
        System.out.println(width);
    }
}