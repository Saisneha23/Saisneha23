import java.util.*;
import java.lang.*;
class MyOwnException extends Exception{
	public MyOwnException(String str){
		super(str);
	}
}
class LAB96{
	public static void main(String args[]){
		try{
			throw new MyOwnException("Saisneha");
		}
		catch(MyOwnException e){
			System.out.println(e);
		}
	}
}
