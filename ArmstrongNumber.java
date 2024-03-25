import java.util.Scanner;
public class ArmstrongNumber
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter A Number To Check Wheather It's Armstrong Or Not: ");
int n=sc.nextInt();
sc.close();
if(isArmstrong(n))
System.out.println(n+" Number is Armstrong");
else
System.out.println(n+" Number is Not Armstrong");
}
public static boolean isArmstrong(int n)
{
int number=n,sum=0,power,digit;
power=String.valueOf(n).length();
while(n>0)
{
digit=n%10;
sum+=Math.pow(digit,power);
n=n/10;
}
return sum==number;
}
}