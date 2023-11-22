import java.util.*;
class LAB47{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        String rev=new String();
        for(int i=str.length()-1;i>=0;i--)
        {
            rev+=str.charAt(i);
        }
        System.out.println("Reverse of a string : "+rev);
    }
}
