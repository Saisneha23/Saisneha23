import java.util.*;
class LAB41{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str1=sc.next();
        String s=sc.next();
        if(str1.compareTo(s)==0)
        System.out.println("Strings are equal"+str1.compareTo(s));
        else
        System.out.println("Strings are not equal"+str1.compareTo(s));
    }
}
