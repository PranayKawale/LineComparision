
public class UC3 {
	
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

		    double Length1;
		    double Length2;
		  
		    Length1 = Math.sqrt(Math.pow(x2 - x1, 2)) + (Math.pow(y2 - y1, 2));
		    System.out.println("Length of line 1 ::");
		    System.out.println(Length1);
		    double  a = Length1 ;
		  
		  
		  Length2 = Math.sqrt(Math.pow(x4 - x3, 2)) + (Math.pow(y4 - y3, 2));
		  System.out.println("Length of line 2 ::"); 
		  System.out.println(Length2);
		  double b = Length2 ;
		  
		  if (Double.compare(a, b) == 0) {
	            System.out.println("Length1 = Length2");
		   }
	        else if (Double.compare(a, b) < 0) {
	            System.out.println("Length1 is less than Lenth2");
	        }
	        else {
	            System.out.println("Length1 is greater than Length2");
	        }
	    }
	}


