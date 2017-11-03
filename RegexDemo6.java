import java.util.regex.*;

class RegexDemo6
{
  public static void main(String[] args)
  {
    int count=0;
    Pattern pattern=Pattern.compile("[0-9a-zA-Z]");
    Matcher matcher=pattern.matcher("AWXabbafZUIgb12bacde67");
    
	while(matcher.find())
    {
      ++count;
      System.out.println(matcher.start()+"....."+matcher.end()+"....."+matcher.end()+"...."+matcher.group());
    }
    
	System.out.println("the total number of occurrence: "+count);
  }
}