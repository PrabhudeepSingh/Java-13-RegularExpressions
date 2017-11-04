import java.util.*;

class StringTokenizerDemo
{
  public static void main(String[] args)
  {
    StringTokenizer st=new StringTokenizer("Prabhudeep Singh Banga");
	
    while(st.hasMoreTokens())
    {
      System.out.println(st.nextToken());
    }
	
  }
}
//default RegularExpression for StringTokenizer is space