import java.util.regex.*;

class RegexDemo3
{
  public static void main(String[] args)
  {
    int count=0;
    Pattern p=Pattern.compile("[a-z]");
    Matcher m=p.matcher("AWXabbafZUIgbbacde");
	
    while(m.find())
    {
      ++count;
      System.out.println(m.start()+"....."+m.end()+"....."+m.end()+"...."+m.group());
    }
	
    System.out.println("the total number of occurrence: "+count);
  }
}