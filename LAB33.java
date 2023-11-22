import java.util.*;
abstract class Monster{
	String name;
	abstract void attack();
}
class Fire extends Monster{
	void attack()
	{
		name="Fire Monster";
	}
}
class Water extends Monster{
	void attack()
	{
		name="Water Monster";
	}
}
class Stone extends Monster{
	void attack()
	{
		name="Stone Monster";
	}
}
class LAB33{
	public static void main(String args[])
	{
		Monster m=new Fire();
		m.attack();
		System.out.println(m.name);
		Monster m1=new Water();
		m1.attack();
		System.out.println(m1.name);
		Monster m2=new Stone();
		m2.attack();
		System.out.println(m2.name);
	}
}
