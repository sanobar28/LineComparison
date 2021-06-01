import java.lang.Math;

public class LineComparison{

	public static void main(String[] args){
	
		//System.out.println("Welcome to line comparison pgm");
		
		int x1=20, y1=15, x2=22, y2=17;
		double length = Math.sqrt((x2-x1)^2 + (y2-y1));

 		System.out.println("Length of line: " + length);
		
	}

}