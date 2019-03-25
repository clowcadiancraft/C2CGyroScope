import java.util.Scanner;

public class triage {
	
	c2cLocal cLoc = new c2cLocal();
	String state = "";
	String rewind = "";
	String forward = "";
	Scanner nerve = new Scanner(System.in);
	
	public triage(int type)
	{		
		
		System.out.println("FOCUS: " + cLoc.bases(type));
		
		for(int angNum = 0; angNum < 3; angNum++)
		{
			System.out.println("Please make a statement: ");
			this.state = this.nerve.nextLine();
			System.out.println("Please rewind and restate: ");
			this.rewind = this.nerve.nextLine();
			System.out.println("Please forward and restate: ");
			this.forward = this.nerve.nextLine();
		}
		
	}

}
