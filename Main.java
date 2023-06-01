import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      while(true)
        {
      Scanner s=new Scanner(System.in);
      System.out.println("enter the number");
      System.out.println("enter 1st number");
      double x=s.nextDouble();
       System.out.println("enter 2nd number");
      double y=s.nextDouble();
       System.out.println("enter 3rd number");
      double z=s.nextDouble();
      if(y>x && z>y)
      {
        System.out.println("INCREASING");
      }
      else if(x>y && y>z)
      {
        System.out.println("DECREASING");
      }
      else
      {
        System.out.println("Neither increasing nor decreasing order");
      }
        }
    }
}
