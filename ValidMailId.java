import java.util.regex.*;
class ValidMailId
{
  public static void main(String[] args)
  {
    Pattern pattern=Pattern.compile("[a-zA-Z0-9][a-zA-Z0-9_.]*@[a-zA-Z0-9]+([.][a-zA-Z]+)+");
    Matcher matcher=pattern.matcher(args[0]);
	
    if(matcher.find()&& matcher.group().equals(args[0]))
    {
		System.out.println("valid");
	}
	
    else
    {
		System.out.println("invalid");
	`}
   }
}