import java.util.Scanner;
public class SumOfElementsOfArray
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter Number Of Elements: ");
int size=sc.nextInt();
int a[]=new int[size];

for(int i=0;i<size;i++)
{
System.out.println("Enter Element "+(i+1));
a[i]=sc.nextInt();
}
int sum=0;
for(int i=0;i<size;i++)
{
sum+=a[i];
}
System.out.println("Sum Of Array Is: " +sum);
}
}

