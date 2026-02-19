package Week16Workshop;
import java.util.Scanner;

public class Q1
{
    public static void main(String[] abc)
    {
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the first String");
    String s1=s.nextLine();
    System.out.println("Enter the second String");
    String s2=s.nextLine();
    String s3=s1.concat(s2);
    System.out.println("Concatenated String is: "+s3);
    System.out.println("Enter the third String");
    String s4=s.nextLine();
    int result=s3.compareTo(s4);
    System.out.println(result);
    
    
    
    }
}