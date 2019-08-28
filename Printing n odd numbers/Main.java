import java.util.Scanner;
class Main {
	public static void main (String[] args)
    {
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int count;
      for(count = 0; count<=2*n; count++)
      {
        if(count%2 == 1)
          System.out.println(count);
      }// Type your code here
	}
}