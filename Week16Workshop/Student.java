package Week16Workshop;
public class Student
{
    //Attributes
 private String name;
 private int age;
 private String school;
 private int grade;
 private String citizenship;
 private String phone;
  
 //Constructor
 public Student(String name,int age,String school,int grade,String citizensip,String phone)
 {
    this.name=name;
    this.age=age;
    this.school=school;
    this.grade=grade;
    this.citizenship=citizensip;
    this.phone=phone;
 }
    
 //getters for name
 public String getName()
 {
     return this.name;
 }
 
 //getters for age
 public int getAge()
 {
     return this.age;
 }
 
 //getters for School
 public String getSchool()
 {
     return this.school;
}

//getters for grade
public int getGrade()
{
    return this.grade;
}

//getteres for citizensip
public String getCitizenship()
{
    return this.citizenship;
}

//getters for phone
public String getPhone()
{
    return this.phone;
}

//Method to getNameInitials
public String getNameInitials(String name)
{
 StringBuilder sb=new StringBuilder();
 String trimmedName=name.trim();
 String[] nameArray=trimmedName.split("\\s+");
 for(int i=0;i<name.length();i++)
 {
    String word=nameArray[i].substring(0,1).toUpperCase();
    sb.append(word).append(".");
 }
 return sb.toString();
}

@Override
public String toString()
{
return String.format("%s | %d | Grade %d | %s",name,age,grade,school);
}

}