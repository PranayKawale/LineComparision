
public class UC2 {
	
public static void main(String[] args) 
	
	{
		
		    double x1 = 3;
	        double x2 = 4;
	        double  y1 = 6;
	        double  y2 = 7;

	        double x3 = 6;
	        double  y3 = 4;
	        double  x4 = 7;
	        double  y4 = 8;

		    double Distance1;
		    double Distance2;
		  
		  Distance1 = Math.sqrt(Math.pow(x2 - x1, 2)) + (Math.pow(y2 - y1, 2));
		  System.out.println("Length of line 1 ::");
		  System.out.println(Distance1);
		  String str1 = Double.toString(Distance1);
		  
		  Distance2 = Math.sqrt(Math.pow(x4 - x3, 2)) + (Math.pow(y4 - y3, 2));
		  System.out.println("Length of line 2 ::"); 
		  System.out.println(Distance2);
		  String str2 = Double.toString(Distance2);
		  
		  System.out.println(str1.equals(str2));

	}
}
