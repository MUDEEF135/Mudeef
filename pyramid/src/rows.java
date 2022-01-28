import java.util.*;
public class rows 
{
	public static void main(String[] args)
	{
	 Scanner sc= new Scanner(System.in);
	 System.out.print("Enter the no of rows:");
	 int r=sc.nextInt();
	 System.out.print("Enter  the vlaue:");
	 char c = sc.next().charAt(0);
	 for(int i=0;i<=r;i++) 
	 {
		 for(int j=0;j<=i;j++)
			 {
			 System.out.print(c);
			 }
		 System.out.println();
	 }
	 }
}
