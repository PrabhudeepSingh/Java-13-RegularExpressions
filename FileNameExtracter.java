import java.io.*;
import java.util.regex.*;

class FileNameExtracter
{
  public static void main(String[] args) throws Exception
  {
     int count=0;
	 
     Pattern pattern=Pattern.compile("[a-zA-Z0-9$.]+[.]java");
     File file=new File("C:\\MyCode\\JavaPrograms");
     String[] str=file.list();
	 
     for(String s1:str)
     {
       Matcher matcher=pattern.matcher(s1);
       if(matcher.find()&& matcher.group().equals(args[0]))
       {
         count++;
         System.out.println(s1);
       }
     }
	 
     System.out.println(count);
  }
}