import java.util.*;

public class Haiku{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[] lines=new String[3];
        for (int i=0;i<3;i++){
            lines[i]=sc.nextLine();
        }
        int []pattern={5,7,5};
        for (int j=0;j<3;j++){
            int count=0;
        for (char ch:lines[j].toCharArray()){
            if ("aeiou".indexOf(Character.toLowerCase(ch))>=0){
                count++;
            }
        }
       if (count!=pattern[j]){
        System.out.println("NO");
        return;
       }
        }
        System.out.println("YES");
    }
}