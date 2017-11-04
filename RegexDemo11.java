import java.util.regex.*;
 
class RegexDemo11
{
  public static void main(String[] args)
  {
    int count=0;
    Pattern pattern=Pattern.compile("a!");
    Matcher matcher=pattern.matcher("AW Xabba fZUIgb12bacde67");
	
    while(matcher.find())
    {
      ++count;
      System.out.println(matcher.start()+"....."+matcher.end()+"....."+matcher.end()+"...."+matcher.group());
    }
    System.out.println("the total number of occurrence: "+count);
  }
}
