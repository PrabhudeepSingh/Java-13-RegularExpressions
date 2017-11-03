import java.util.regex.*;

class RegexDemo4
{
  public static void main(String[] args)
  {
    int count=0;
    Pattern pattern=Pattern.compile("[A-Z]");
    Matcher matcher=pattern.matcher("AWXabbafZUIgbbacde");
	
    while(matcher.find())
    {
      ++count;
      System.out.println(matcher.start()+"....."+matcher.end()+"....."+matcher.end()+"...."+matcher.group());
    }
	
    System.out.println("the total number of occurrence: "+count);
  }
}