package krn;

public class revs {

public static void main (String [] args) 
{
	String str = "code";
	String rstr = " ";
	char ch;
	for (int i=0;i<str.length();i++)
	{
		ch= str.charAt(i);
		rstr=ch+rstr;
		
	}
	
	System.out.println(" reverse string : " + rstr);
}
	
	
}
