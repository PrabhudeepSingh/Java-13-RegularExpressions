import java.util.regex.*;

class RegexDemo12
{
  public static void main(String[] args)
  {
    int count=0;
    Pattern p=Pattern.compile("\\a");
	
    String[] s=p.split("Prabhudeep Singh Banga");
	
    for(String s1:s)
    {
		System.out.println(s1);
	}
  }
}