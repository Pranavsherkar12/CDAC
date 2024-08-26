public class Pattern14
{
	public static void main(String... args)
	{
		for(int i=1;i<=9;i++)
		{
			if(i%2==0&& i>2)
			{
				continue;
			}
			
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}
}