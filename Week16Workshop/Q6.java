package Week16Workshop;
public class Q6
{
    public static void main(String[] args)
    {
          String text="  Dad  ";
          String trimText=text.trim();
          StringBuilder sb=new StringBuilder();
          for(int i=trimText.length()-1;i>=0;i--)
          {
              sb.append(trimText.charAt(i));
          }
          String reverseText=sb.toString();
          if(trimText.equalsIgnoreCase(reverseText))
          {
              System.out.println(trimText +" is Palindrome");
          }
          else
          {
              System.out.println(trimText +" isn't Palindrome");
          }
    }
}