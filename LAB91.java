import java.util.*;
import java.lang.*;
class LAB91{
	public static void main(String args[])
	{
		try{
			throw new Exception("Exception throwed");
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}
