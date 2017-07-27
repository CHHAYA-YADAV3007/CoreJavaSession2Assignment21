package Session2Assignment21;

public class Assignment21 

{

	public static void main(String[] args)
	{
	     int a = 1057 ,b = 10 , c = 11300 ;
	     
	     int highest = 0;
	     

// logic to calculate highest number among the given 3 numbers
	     
	        if(a > b)
	          {
	    	    highest = a ;
	          }
	        else
	          {
	    	    highest = b ;
	          }
	     
	        if (c > highest)
	          {
	    	    highest = c ;
	    	  }
	        
// display the highest number      
	        
	        System.out.println("Highest of all the 3 numbers is "  + highest);

	}
}

