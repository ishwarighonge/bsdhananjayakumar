package kumar;

public class ExceptionDemo {
	//Scenario1: divide by zero Arithmetic Exception
	void arithmeticDemo()
	{
		try
		{
			int no = 100/0;
			System.out.println("no :"+no);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		//rest of code
		System.out.println("Its exception handling code");
	}
	
	//Scenario2: String does not have value NullPointer Exception
	void StringLength()
	{
		try
		{
			String str = null;
			System.out.println("length of str :"+str.length());
		}
		catch (NullPointerException e)
		{
			System.out.println(e);
		}
		System.out.println("Example of Nullpointer Exception");
	}
	//Scenario3: ArrayIndexOutOfBoundsException
	void ArrayIndex()
	{
		try
		{
			int a[] = new int[5];
			a[10] = 30;//ArrayIndexOutOfBoundsException
			System.out.println("")
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
