import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Node {
	
	String[] bases = {"foundation", "passion", "manifestation", "compassion",
			"expression", "obsevation", "conception"};
	String basesString = "foundation, passion, manifestation, compassion, "
			+ "expression, obsevation, conception";
	int intent;
	char xLong, xLat, xAlt, inSpin, orbSpin, flux, force;
	String prisms, faces;
	String[] categories = new String[37];
	String[] patterns = new String[6];
	String pattern = "";
	Scanner nerve = new Scanner(System.in);
	
	
	public Node() 
	{	
		setPrep();
		System.out.println("Please select intention 1-6: " + basesString);
		this.intent = this.nerve.nextInt();		
		setCoords();
		setAngVel();
		setMagField();
		setPrism(this.intent);
		//System.out.println("Please select preffered Amount of Prism over 3");
		//System.out.println("Please assume the flux force between 1-6: ");
		//this.force = (char) this.nerve.nextInt();
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
	
	public String setPrism(int intent)
	{
		
			
		return prisms;
		
	}
	
	public String setFace(String Prism)
	{
		return faces;
		
	}
	
	public void setPrep()
	{
		try 
		{
			
			BufferedReader catReader = new BufferedReader(new FileReader(
					"C:/Users/Andrew/eclipse-workspace/C2cScope/src/BaseCategories.txt"));
			for (int i = 0; i < categories.length; i++)
			{
				this.categories[i] = catReader.readLine();
				//System.out.println(categories[i]);
			}
			catReader.close();
			
		} 
		catch (FileNotFoundException e) {
			
			e.printStackTrace();
			
		} catch (IOException e) 
		{
			e.printStackTrace();
		}
		

	}
	
	
	
	/*
	 * public static void nodeCreate() {
	 * 
	 * 
	 * 
	 * 
	 * for (int base = 0; base < bases.length-1; base++) { String catStr = ""; for
	 * (int row = 0; row < 6; row++) { catStr += cat[((row+1)*(base+1))-1] + " "; }
	 * System.out.println("Please choose a " + bases[base] + ": " + catStr); catStr
	 * = ""; }
	 * 
	 * 
	 * }
	 */

}
