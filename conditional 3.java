import java.util.Scanner;
public class Main
{
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
	   char n =scan.next().charAt(0);
	   char n1=scan.next().charAt(0);
	   if (n>n1)
	   System.out.println(n1+" "+n);
	   else
	   {
	       System.out.println(n+" "+n1);
	   }

}
}
