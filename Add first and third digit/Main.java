import java.util.Scanner;
class Main{
	public static void main (String[] args) {
		// Type your code here
      Scanner in=new Scanner(System.in);
      int num=in.nextInt();
      int n1=num%10;
      int n2=num/100;
      int Sum=n1+n2;
      System.out.println(Sum);
	}
}