package Week16Workshop;
import java.util.Scanner;

public class Q5
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        StringBuilder sb=new StringBuilder();
        System.out.println("Enter the first String");
        String s1=s.nextLine();
        System.out.println("Enter the second String");
        String s2=s.nextLine();
        System.out.println(sb.append(s1).append(s2));
        System.out.println(sb.append(s1).append(s2).append("1").append("@"));
        
    }
}