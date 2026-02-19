package Week16Workshop;
import java.util.Scanner;

public class Q2
{
    public static void main(String[] args)
    {
    String text="   I am Learning Java   ";
    String trimText=text.trim();
    System.out.println("String after removing whitespace is: "+trimText);
    System.out.println(trimText.substring(0,11));
    String[] splitText=trimText.split(" ");
    
    for(String s:splitText)
    {
       System.out.println(s); 
    }
    
    }
}