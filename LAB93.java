import java.util.*;
import java.lang.*;
class LAB93{
	static void two() throws Exception{
		throw new Exception("Exception throwed");
	}
	static void one() throws Exception{
		two();
	}
	public static void main(String args[])
	{
		try{
			one();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
