
import java.util.Scanner;

public class prism {
	
	c2cLocal cLoc = new c2cLocal();
	String pat = "";
	Scanner nerve = new Scanner(System.in);
	
	public prism(int intent, int catId)
	{		
		System.out.println("FOCUS PRISM:" + cLoc.categories[catId]);
		for(int vecNum = 0; vecNum < 6; vecNum++)
		{
			this.cLoc.getPattern(vecNum);
			System.out.println("Please choose one of the following 1-6: "
					+ );
			//this.xLong = (char) this.nerve.nextInt();
		}
		
		
	}

}
