import java.util.regex.*;

class RegexDemo1
{
  public static void main(String[] args)
  {
    int count=0;
    Pattern pattern=Pattern.compile("ab");
    Matcher matcher=pattern.matcher("abbabba");
	
    while(matcher.find())
    {
      ++count;
      System.out.println(matcher.start()+"....."+matcher.end()+"....."+matcher.end()+"....."+matcher.group());
    }
	
    System.out.println("the total number of occurrence: "+count);
  }
}