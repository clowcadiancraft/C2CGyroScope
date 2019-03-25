import java.util.Scanner;

public class vector 
{
	
	c2cLocal cLoc = new c2cLocal();
	String pat = "";
	Scanner nerve = new Scanner(System.in);
	
	public vector(int intent)
	{		
		
		for(int angNum = 0; angNum < 6; angNum++)
		{
			this.cLoc.getPattern(intent);
		}
		
	}


}
