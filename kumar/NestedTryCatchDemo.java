package kumar;

public class NestedTryCatchDemo {
	void testNestedTry()
	{
		//outer
		try
		{
			System.out.println("divide by zero");
			int no = 90/0;
		}
		//inner catch1
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		//inner try2
		try
		{
			System.out.println("ArrayIndexOutofbound");
			int a[] = new int[5];
			a[10] = 23;
		}
		//inner catch2
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		System.out.println("Its a nestedtry catch demo");
	}
	catch(Exception e)//outer catch
	{
		System.out.println("handled the exception");
	}
	System.out.println("rest of code");
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
