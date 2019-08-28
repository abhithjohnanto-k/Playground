import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
     Scanner in =  new Scanner(System.in);
    int num = in.nextInt();
    //int rev = ((num/100) ((num/10)%10)(num%10));
    int rev1 = (num/100);
    int rev2 = ((num/10)%10);
    int rev3 = (num%10) ;
    System.out.println(rev3+""+rev2+""+rev1);
    
  }
}