import java.util.*;
class LAB45{
    public static void main(String args[])
    {
        int countVowels=0;
        int countConsonants=0;
        Scanner sc=new Scanner(System.in);
        String str1=sc.next();
        for(int i=0;i<str1.length();i++)
        {
            if(str1.charAt(i)=='a' || str1.charAt(i)=='e' || str1.charAt(i)=='o' ||str1.charAt(i)=='i' || str1.charAt(i)=='u' || str1.charAt(i)=='A' || str1.charAt(i)=='E' || str1.charAt(i)=='O' ||str1.charAt(i)=='I' || str1.charAt(i)=='U')
            {
                System.out.print(str1.charAt(i)+" ");
                countVowels++;
            }
            else
            {
                countConsonants++;
            }
        }
        System.out.println("vowel count : "+countVowels);
        System.out.println("consonants count : "+countConsonants);
    }
}
