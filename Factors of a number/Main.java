import java.util.Scanner;
class Main{
	public static void main (String[] args)
    {
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      for(int temp = 1; temp <= n; temp++)
      {
        if(n%temp == 0)
          System.out.println(temp);
      }// Type your code here
	}
}
