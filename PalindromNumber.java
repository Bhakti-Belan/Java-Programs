import java.util.Scanner;
public class PalindromNumber
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter A Number To Check Wheather It's Palindrome Or Not: ");
int n=sc.nextInt();
sc.close();
if(isPalindrome(n))
System.out.println(n+" is Palindrome");
else
System.out.println(n+" is Not Palindrome");
}
public static boolean isPalindrome(int n)
{
int number=n,revNumber=0;
while(n>0)
{
int digit=n%10;
revNumber=revNumber*10+digit;
n=n/10;
}
return revNumber==number;
}
}
