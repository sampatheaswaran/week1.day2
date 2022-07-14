package week1.day2;

public class CountofString 
{

	public static void main(String[] args) 
	{
		String name = "Cognizant";
		char chr = 'z';
		int count = 0;

		char[] str = name.toCharArray();

		for (int i = 0; i <str.length; i++) 
		{
			if (chr==str[i])
			{
				count ++;
			}
		}
		System.out.println(count);
	}
}