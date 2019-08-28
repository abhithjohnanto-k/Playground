	import java.util.Scanner;
class Main{
  public static void main (String[] args)
    {
      Scanner in = new Scanner(System.in);
      int num = in.nextInt();
      int rem, temp, value = 0 ;
      temp = num;
      while(num>0)
      {
        rem = num % 10;
        num = num /10;
        value = value + (rem * rem * rem);
        
      }
      if(value == temp)
      {
        System.out.println("Armstrong Number");
      }
    else  
    {
		System.out.println("Not a Armstrong Number"); 
    } 
      // Type your code here
	}
}