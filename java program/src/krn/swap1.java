package krn;

public class swap1 {
public static void main (String [] args)
{
	int a = 10;
	int b = 20;

	 
	System.out.println("before swapping a " + a);
	System.out.println("before swapping b " + b);
	
	 a=a+b;
	 b=a-b;
	 a=a-b;
	 
		System.out.println(" \n after swapping a " + a );
		
			System.out.println(" after swapping b " + b   );
	
	
}
}
