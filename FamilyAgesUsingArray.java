import java.util.Scanner;
public class FamilyAgesUsingArray
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n;
System.out.print("Enter Number Of Members In Family: ");
n=sc.nextInt();
int m[]=new int[n];

for (int i=0;i<n;i++)
{
System.out.println("Enter age Of Member "+(i+1)+": ");
m[i]=sc.nextInt();
}
sc.close();
int min=m[0],max=m[0];
for(int i=1;i<n;i++)
{
if(m[i]<min)
min=m[i];
if(m[i]>max)
max=m[i];
}
System.out.println("Youngest Family Member Ages "+min);

System.out.println("Eldest Family Member Ages "+max);
}
}
