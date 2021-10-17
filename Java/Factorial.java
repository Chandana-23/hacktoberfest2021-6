public class Factorial
{
	public static void main(String[] args) {
		int n = 5;
		int pdt = 1;
		for(int i = 1;i<=n;i++)
		{
		    pdt *= i;
		}
		System.out.println("Factorial of "+n+" = "+pdt);
	}
}


