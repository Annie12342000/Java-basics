import java.util.Scanner;
class FibRec
{
static int a=0,b=1,c=0;
public static void fib(int n)
{
if (n>0)
{
System.out.print(a +" ");
c=a+b;
a=b;
b=c;
fib(n-1);
}
}
public static void main (String [] args)
{
Scanner scn=new Scanner(System.in);
System.out.print("Enter an input:" + " ");
int n = scn.nextInt();
System.out.print("The Fibonacci series:" + " ");
fib(n);
}
}