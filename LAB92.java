import java.util.*;
import java.lang.*;
class LAB92{
	public static void main(String args[])
	{
		try{
			int num=5/0;
		}
		catch(Exception e){
			System.out.println(e);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
	}
}
