//Multiplication Table
import java.util.Scanner;
class Main{
  public static void main(String[]args)
  {
    System.out.println("Enter the num");
    Scanner Sc=new Scanner(System.in);
    int a=Sc.nextInt();
    for(int i=1;i<=10;i++)
    {
      System.out.println(i+"x" +a+"="+a*i);
    }
  }
}
