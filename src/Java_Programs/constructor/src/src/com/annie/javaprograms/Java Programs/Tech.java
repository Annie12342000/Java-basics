import java.util.Scanner;
class Tech
{

public static void main(String[]args)
{
    Scanner scn = new Scanner(System.in);
    System.out.println("Enter a number:");
    int n = scn.nextInt();
    int rem=0;
    int len=0;
    int temp=n;
    int sum=0;
    int sqr=0;
    int div=0;

    while(n>0)
     {
        len++;
        rem=n%10;
        System.out.println(rem);
        n/=10;
        System.out.println(n);
        System.out.println(len);
     }
     n=temp;
     if(len%2==0)
     {
        div=(int)(Math.pow(10,len/2));
        System.out.println(div);
        rem=n%div;
        System.out.println(rem);
        n=n/div;
        System.out.println(n);

        sum=rem+n;
        System.out.println(sum);
        sqr=sum*sum;
        System.out.println(sqr);

     }
     if(temp==sqr)
     System.out.println("It's a Tech number");
     else
     System.out.println("It's not a Tech number");
}
}
