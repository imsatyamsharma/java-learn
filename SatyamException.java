class SatyamException extends Exception
{
	SatyamException(String msg)
	{
		super("SatyamException:"+msg);
	}
}
class CallSatyamexception
{
	public static void main(String args[])
	{
		try
		{
			System.out.println("inside the try block");
			throw new SatyamException("this is a test");
		}
		catch(SatyamException ae)
		{
			System.out.println("catch block: \n \n"+ae.getMessage());
		}
	}
}