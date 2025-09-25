import java.util.*;

public class Homework{
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     int value=sc.nextInt();
     for (int j=0;j<value;j++){
        
        int n1=sc.nextInt();
        sc.nextLine();
        String a=sc.nextLine();
        int n2=sc.nextInt();
        sc.nextLine();
        String b=sc.nextLine();
        String format=sc.nextLine();
     for (int i=0;i<n2;i++){
        if (format.charAt(i)=='D') {
            a=a+b.charAt(i);
        }
        else{
            a=b.charAt(i)+a;
        }
     }
     System.out.println(a);
    }
    }
}