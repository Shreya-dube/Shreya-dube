import java.util.Scanner;
public class ExceptionDemo{
	public static void main(String[] args){
		try{
			try{
				int N1,N2,N3
				Scanner s = new Scanner(System.in);
				System.out.println("Enter two numbers : ");
				N1 = s.nextInt();
				N2 = s.nextInt();
				N3 = N1/N2;
				System.out.println(N3);
			}
			catch(ArithmeticException e1)
			{
				System.out.println("A number cannot be divided by 0 !!!");
			}
			catch(Exception e3)
			{
				System.out.println("Enter numbers only!!!");
			}
			String N4 = null;
			if (N4.equals("ABC"))
                System.out.print("Same");
            else
                System.out.print("Not Same");
		}
		catch(Exception ee)
		{
			System.out.println("The String is assigned with a null value");
		}
	}
}