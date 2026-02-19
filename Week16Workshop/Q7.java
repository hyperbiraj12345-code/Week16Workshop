package Week16Workshop;
public class Q7
{
    public static void main(String[] args)
    {
        
        String ph="9687654320";
        //String regex="(97|98)\\d{8}";
        String regex="9[78][0-9]{8}";
        if(ph.matches(regex))
        {
            System.out.println(ph+ " is valid phone number");
        }
        else
        {
            System.out.println(ph+ " is'nt valid phone number");
        }
    }
}