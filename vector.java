import java.util.Scanner;

public class vector 
{
	
	c2cLocal cLoc = new c2cLocal();
	String pat;
	char ang;
	Scanner nerve = new Scanner(System.in);
	
	public vector(int intent)
	{		
		
		this.pat = this.cLoc.getPattern(intent);
		
		
		for(int angNum = 0; angNum < 6; angNum++)
		{
			this.ang = this.pat.charAt(angNum);
			triage tri = new triage(angNum*intent);
			
		}
		
	}


}
