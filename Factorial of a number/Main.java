import java.util.Scanner;
class Main{
	public static void main (String[] args)
    {
      Scanner in = new Scanner(System.in);
      int fact = in.nextInt();
      int value = 1;
      for(int temp = 1; temp <= fact; temp++)
      {
        value *= temp;
      }
      System.out.println(value);
        // Type your code here
	}
}