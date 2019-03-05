package temp;
import java.util.*;
public class fahrn {
	public int converttocelcius() {
	    float F=10,C;
	    //Scanner p = new Scanner(System.in);
	 
	    //System.out.println("Enter temperature in Fahrenheit");
	    //temperature = p.nextInt();
	 
	    C= ((F- 32)*5)/9;
	 
	    System.out.println("temperature in Celsius = " + C);
	    return 0;
	  }
	public int converttofahrn()
	{
		double C=28.5,F;
		  F=(( C *9)/5) + 32;
		  System.out.println("temperature in Celsius = " + F);
		return 0;
	}
	
}
