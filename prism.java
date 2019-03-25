
import java.util.Scanner;

public class prism {
	
	c2cLocal cLoc = new c2cLocal();
	String pat = "";
	Scanner nerve = new Scanner(System.in);
	
	public prism(int intent)
	{		
		for(int vecNum = 0; vecNum < 6; vecNum++)
		{
			this.cLoc.getPattern(intent);
		}
		
		
	}

}
