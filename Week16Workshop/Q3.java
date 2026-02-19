package Week16Workshop;
import java.util.Scanner;

public class Q3
{
    public static void main(String[] Biraj)
    {
        Scanner s=new Scanner(System.in);
        String text="HelloWorld";
        System.out.println("HelloWorld");
        System.out.println("Enter the index to get character");
        int index=s.nextInt();
        System.out.println("Character is:"+text.charAt(index));
        System.out.println("Enter the character to get its position");
        char c=s.next().charAt(0);
        for(int i=0;i<text.length();i++)
        {
           if(text.indexOf(c)!=-1) 
           {
            System.out.println("Index of "+c+"is"+text.indexOf(c));
            
           }
           else
           {
            System.out.println("Character isnt found");
           }
           
        }
        System.out.println("Enter the word to get its position");
        String word=s.nextLine();
        for(int i=0;i<text.length();i++)
        {
            if(text.indexOf(word)!=-1) 
           {
            System.out.println("Index of "+word+"is"+text.indexOf(word));
           }
           else
           {
            System.out.println("Word isnt found");
           }
        }
        
    }
}