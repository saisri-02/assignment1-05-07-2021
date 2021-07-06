import java.util.*;
class Secondlargest
{
public static void main(String[] args) 
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter size of array : ");
int n=sc.nextInt();
int temp;
int a[ ]=new int[n];
System.out.println("enter values in array : ");
for(int i=0;i<n;i++)
{		
a[i]=sc.nextInt();
}
for(int i=0;i<n;i++)
{
for(int j=i+1;j<n;j++)
{
if(a[i]>a[j])
{
temp=a[i];
a[i]=a[j];
a[j]=temp;
}
}
}
System.out.println("Second Largest Number = "+a[n-2]);
}
}