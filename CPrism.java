
import java.util.Scanner;

public class CPrism 
{
	
	c2cLocal cLoc = new c2cLocal();
	Scanner nerve = new Scanner(System.in);
	String pat;
	int vecIntent;
	
	public CPrism(int prsmNum, int intent)
	{		
		System.out.println("FOCUS PRISM:" + cLoc.getTheme(prsmNum));
		
		for(int vecNum = 0; vecNum < 6; vecNum++)
		{
			this.pat = this.cLoc.getPattern(intent);
			int num = vecNum--;
			System.out.println(num);
			System.out.println("Please choose one of the following 1-6: "
					+ cLoc.getPattern(num));
			this.vecIntent = this.nerve.nextInt();
			CVector vec = new CVector(vecNum, vecNum*vecIntent);
			
		}
			
		
	}

}
