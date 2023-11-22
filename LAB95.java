import java.util.*;
import java.lang.*;
class LAB95{
	public static void main(String args[]){
		String str="1333s";
		int num;
		try{
			num=Integer.valueOf(str);
		}catch(NumberFormatException e)
		{
			System.out.println(e);
		}
	}
}
