import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    Scanner in = new Scanner (System.in);
          int n = in.nextInt(), temp, sum = 0;
      	  while (n > 0)
          {
            temp = n%10;
            sum = sum + temp;
            n = n/10;
          }
      System.out.println(sum);// Type your code here
	}
}