package Week16Workshop;
public class CensusProcessor
{
String[] csvData = {
"Name,Age,School,Grade,Citizenship,Phone",
"Ram Bahadur Thapa,18,Itahari Int. College,12,01-0012345,9841234567",
"Sita Kumari Rai,17,Itahari Int. College,11,01-0054321,9807654321",
"Hari Prasad Sharma,19,ICK College,12,02-0098765,9812345678",
"Gita Devi Tamang,16,ICP College,10,03-0011111,9800000000",
"Bikash Kumar Limbu,18,Itahari Int. College,12,01-0077777,9841111111",
"Anita Rai,17,ICK College,11,04-002222,981234",
"Deepak Shah,20,ICP College,12,01-00ABCDE,9867890123"
};

public static Student[] parseCSV(String[] csvData)
{
    int index=0;
  Student[]  stu=new Student[csvData.length-1];
  for(int i=1;i<csvData.length;i++)//Skip the header row
  {
      String[] data=csvData[i].split(",");//Splitting name,age etc. on the basis of ,
      String name=data[0].trim();
      int age=Integer.parseInt(data[1].trim());
      String school=data[2].trim();
      int grade=Integer.parseInt(data[3].trim());
      String citizenship=data[4].trim();
      String phone=data[5].trim();
      
      stu[index]=new Student(name,age,school,grade,citizenship,phone);
      index=index+1;
      
  }
  return stu;
}

//Citizensip Validation
public static boolean isValidCitizenship(String citizenship)
{
    String cit=citizenship.trim();
    
    //Retrurning false if the citizenship doesnt contain 10 characters
    if(cit.length()!=10)
    {
        return false;
    }
    
    //Returning false if the characters at 0,1 index isnt digit
    for(int i=0;i<2;i++)
    {
        if(!Character.isDigit(cit.charAt(i)))
        return false;
    }
    
    
    //Returning false if the characters at  index from 3 to 10 exclusive isnt digit
    for(int i=3;i<10;i++)
    {
        if(!Character.isDigit(cit.charAt(i)))
        {
            return false;
        }
        
    }
    
    //Returning false if the charatcer at index 2 isnt '-'
    if(cit.charAt(2)!='-')
    {
        return false;
    }
    
    //Returning true if all the conditions above are true
    return true;
}

}
