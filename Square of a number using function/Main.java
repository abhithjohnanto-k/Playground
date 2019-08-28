import java.util.Scanner;
class Main
{
  public static int square(int m)
  {
    m = m*m;
    return m;
  }


	public static void main (String[] args)
    {
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int squrt = square(n);
      System.out.println(squrt);
	 // Type your code here   
	} 
}