import java.lang.Math;
import java.util.Scanner;

public class LineComparison{

	public static void main(String[] args){
	
		//System.out.println("Welcome to line comparison pgm");
		Scanner s = new Scanner(System.in);
		
	         //getting values from user
	         System.out.println("Enter the first co-ordinate of x of line 1");
	         int x1 = s.nextInt();
	         System.out.println("Enter the first co-ordinate of y of line 1");
	         int y1 = s.nextInt();
	         System.out.println("Enter the second co-ordinate of x of line 1");
	         int x2 = s.nextInt();
	         System.out.println("Enter the second co-ordinate of y of line 1");
	         int y2 = s.nextInt();
			 
	         //operation for finding length of line
	         double length_line1 = Math.sqrt((Math.pow((x2 - x1) , 2 )+Math.pow((y2 - y1) , 2 )));
	         
			 //printing first length of line
	         System.out.println("The length of line 1 is" +length_line1);

	         //entering value for line 2
	         System.out.println("Enter the first co-ordinate of x of line 2");
	         int X1 = s.nextInt();
	         System.out.println("Enter the first co-ordinate of y of line 2");
	         int Y1 = s.nextInt();
	         System.out.println("Enter the second co-ordinate of x of line 2");
	         int X2 = s.nextInt();
	         System.out.println("Enter the second co-ordinate of y of line 2");
	         int Y2 = s.nextInt();
			 
	         //operations for line 2 length
	         double length_line2 = Math.sqrt((Math.pow((X2 - X1) , 2 ) + Math.pow((Y2 - Y1) , 2 )));
	         
			 //displaying result
	         System.out.println("The length of line 2 is " +length_line2);
			 
	        
	        //comparing two lengths of line
	        int lengthCheck = length_line1.compareTo(length_line2);
	        if (lengthCheck==0)
	            System.out.println("Two lines are equal in length");
	        else if (lengthCheck>0)
	            System.out.println("Length_line1 is greater than line_length2");
	        else
	            System.out.println("length_line1 is lesser than line_length2");
	}
		
}

