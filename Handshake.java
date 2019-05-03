import java.util.*;
public class Handshake
{
	public static void main(String[] args)
	{
		int n;
		Scanner input=new Scanner(System.in);
		System.out.print("Enter number of hands:");
		n=input.nextInt();
		for (int i = 1; i <= n; i++)
			System.out.println("handshake("+i+")="+handshake(i));
	}
	public static int handshake(int num)
	{
		if (num < 2)
			return num - 1;
		else
			return num - 1 + handshake(num - 1);
	}
}