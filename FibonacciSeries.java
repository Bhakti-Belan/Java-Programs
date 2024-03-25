import java.util.Scanner;
public class FibonacciSeries
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter Number Of Terms:");
int n=sc.nextInt();
sc.close();
System.out.println("Printing Fibonacci series upto "+n);
fibonacci(n);
}
public static void fibonacci(int n)
{
int first=0,second=1;
System.out.println(first+"\n"+second);
for(int i=3;i<=n;i++)
{
int next=first+second;
System.out.println(next);
first=second;
second=next;
}
}
}
