package Week16Workshop;
public class Q4
{
    public static void main(String[] args)
    {
        String fName="Biraj";
        String fName1=fName.toUpperCase();
        String fName2=fName.toLowerCase();
        System.out.println("UpperCase is: "+fName1);
        System.out.println("LowerCase is: "+fName2);
        String text="heLLO    World";
        String trimmedString=text.trim();
        String[] words=trimmedString.split("\\s+");
        StringBuilder sb=new StringBuilder();        
        for(int i=0;i<words.length;i++)
        {
          String first=words[i].substring(0,1).toUpperCase();
          String rest=words[i].substring(1).toLowerCase();
          sb.append(first).append(rest).append(" ");
        }
        System.out.println(sb.toString().trim());
        
    }
}