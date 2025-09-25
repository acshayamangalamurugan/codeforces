import java.util.*;
public class Tram{
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     int capacity=0;
     int max_cap=0;
     for (int i=0;i<n;i++){
        int a=sc.nextInt();
        int b=sc.nextInt();
        capacity-=a;
        capacity+=b;
        if (capacity>max_cap){
            max_cap=capacity;
        }
     }   
     System.out.println(max_cap);
    }
}