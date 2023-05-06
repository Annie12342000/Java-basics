import java.util.Scanner;
class Swap
{
    public static void main(String[]args)
    {
    Scanner scn=new Scanner(System.in);
    System.out.println("Enter a value");
    int a = scn.nextInt();
    System.out.println("Enter b value");
    int b = scn.nextInt();

    System.out.println("Before swap values of a:" +a+ " and b:" +b);
    a=a+b;
    b=a-b;
    a=a-b;
    System.out.println("After swap values of a:" +a+ "and b:" +b);


}
}