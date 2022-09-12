package exceptionhandling;

public class UncheckedException {

	public static void main(String[] args) {
		System.out.println("program started");
		System.out.println("program in progress");
		
		int a=100;
		
		try
		{
		System.out.println(a/0);
		}
		catch(ArithmeticException e)
		{
			System.out.println("entered into catch block");
		}
		String s=null;
		//System.out.println(s.length());
		
		String x="abc";
		//int i=Integer.parseInt(x);
		
		int[] array =new int[5];
		//array[10]=50;
		
		System.out.println("program about to finish");
		System.out.println("program completed");
	}

}
