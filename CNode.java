
import java.util.Scanner;

public class CNode {
	

	int intent;
	char xLong, xLat, xAlt, inSpin, orbSpin, flux, force;
	String prisms, faces;
	
	String pattern = "";
	Scanner nerve = new Scanner(System.in);
	c2cLocal cLoc;
	String pat = "";
	
	
	public CNode() 
	{	
		cLoc = new c2cLocal();
		System.out.println("Please select intention 1-6: " + cLoc.basesString);
		this.intent = this.nerve.nextInt();	
		//System.out.println(this.intent);
		//setCoords();
		//setAngVel();
		//setMagField();
		setPrisms(this.intent);
	}
	
	public void setCoords()
	{
		System.out.println("Please assume the longtitude between 1-6: ");
		this.xLong = (char) this.nerve.nextInt();
		System.out.println("Please assume the latitude between 1-6: ");
		this.xLat = (char) this.nerve.nextInt();
		System.out.println("Please assume the altitude between 1-6: ");	
		this.xAlt = (char) this.nerve.nextInt();
	}
	
	public void setAngVel()
	{
		System.out.println("Please assume the speed of inner-spin cycle between 1-6: ");
		this.inSpin = (char) this.nerve.nextInt();
		System.out.println("Please assume the speed of orbitat-spin cycle between 1-6: ");
		this.orbSpin = (char) this.nerve.nextInt();
	}
	
	public void setMagField()
	{
		System.out.println("Please assume the flux amount between 1-6: ");
		this.flux = (char) this.nerve.nextInt();
		System.out.println("Please assume the flux force between 1-6: ");
		this.force = (char) this.nerve.nextInt();
	}
	
	public String setPrisms(int intent)
	{
		this.pat = this.cLoc.getPattern(intent);
		System.out.println(this.pat);
		
		for(int prsmNum = 0; prsmNum < 6; prsmNum++)
		{
			CPrism prsm = new CPrism(prsmNum, intent * prsmNum);
		}
			
		return prisms;
		
	}


}
