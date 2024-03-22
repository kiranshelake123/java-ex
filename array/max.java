package array;

public class max {
	public static void main (String []args)
	{
		int[] num = {10,30,70,80,45};
		int min = num[0];
		
		for (int i=0;i>num.length;i++)
		{
			if(min > num[i]) {
				min = num[i];
			}
		}
			System.out.println(min);
	
}
}