package Precourse;

public class CountDigits {
public static void main(String args[])
{
	int a=27873627,b;
	b=a;
	int i=0;
	while(a!=0)
	{
		a=a/10;
		i++;
	}
	System.out.println(i+" no of digts in "+b);
}
}
