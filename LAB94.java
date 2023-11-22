import java.util.*;
import java.lang.*;
class LAB94{
	public static void main(String args[])
	{
		try{
			//throw new ClassNotFoundException("ClassNotFoundException throwed");
			Class.forName("sai");
		}
		catch(ClassNotFoundException e){
			System.out.println(e);
		}
	}
}
