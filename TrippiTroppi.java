import java.util.*;
class TrippiTroppi{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for (int j=0;j<n;j++){
            String s=sc.nextLine();
            String[] s_arr=s.split(" ");
            String word="";
            for (int i=0;i<s_arr.length;i++){
                word+=s_arr[i].charAt(0);
            }
            System.out.println(word);
        }
    }
}