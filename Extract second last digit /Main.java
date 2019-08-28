import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
      int num = in.nextInt();
      int sec = (num/10)%10;
      System.out.println(sec);// Type your code here
	}
}