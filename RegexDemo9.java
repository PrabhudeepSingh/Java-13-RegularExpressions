import java.util.regex.*;

class RegexDemo9
{
  public static void main(String[] args)
  {
    int count1=0;
    Pattern pattern1=Pattern.compile("\\w");
    Matcher matcher1=pattern1.matcher("AW Xabba fZUIgb12bacde67");
	
    while(matcher1.find())
    {
      ++count;
      System.out.println(matcher1.start()+"....."+matcher1.end()+"....."+matcher1.end()+"...."+matcher1.group());
    }
    System.out.println("the total number of occourance...."+count1);
    System.out.println(" ");
	

    int count2=0;
    Pattern pattern2=Pattern.compile("\\W");
    Matcher matcher2=pattern2.matcher("AW Xabba fZUIgb12bacde67");
	
    while(matcher2.find())
    {
      ++count1;
      System.out.println(matcher2.start()+"....."+matcher2.end()+"....."+matcher2.end()+"...."+matcher2.group());
    }
    System.out.println("the total number of occourance...."+count2);
  }
}