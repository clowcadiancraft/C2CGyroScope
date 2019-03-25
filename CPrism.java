
import java.util.Scanner;

public class CPrism 
{
	
	c2cLocal cLoc = new c2cLocal();
	Scanner nerve = new Scanner(System.in);
	String pat;
	int vecIntent;
	
	public CPrism(int intent, int theme)
	{		
		//System.out.println("FOCUS PRISM:" + cLoc.getTheme(theme));
		
		for(int vecNum = 0; vecNum < 6; vecNum++)
		{
			this.pat = this.cLoc.getPattern(intent);
		
			System.out.println("Please choose one of the following 1-6: "
					+ cLoc.getPattern(vecNum));
			this.vecIntent = this.nerve.nextInt();
			CVector vec = new CVector(vecNum, vecNum*vecIntent);
		}
			
		
	}

}
