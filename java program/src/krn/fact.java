package krn;

public class fact {
	

	public static void main (String [] args) {

	int num =6;
	int fact=1;

	for (int i=2; i<num; i++)
	{
		fact = fact * i;
	}
		System.out.println("factorial of " + num + " is :" + fact );

	}
	}



