package array;

public class simpl {
	public static void main (String []args)
	{
		int[] num = {10,30,70,80,45};
		int max = num[0];
		
		for (int i=0;i<num.length;i++)
		{
			if(max < num[i]) {
				max = num[i];
			}
		}
			System.out.println(max);
	
}
}