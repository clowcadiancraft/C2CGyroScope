
import java.io.*;
import java.util.*;

public class R {
	

	Scanner o;
	public String rpi = "Script.txt";
	public List<String> r0r0 = new ArrayList<String>();
	public String r0pi0;
	public String r0b0;	
	public String r0b1[] = new String[3];
	
	public R() {this.orr();}
	
	public void ob(String g)
	{	
		System.out.println(g);		
	}
	
	public String og()
	{
		//this.ob("OG");
		
		this.o = new Scanner(System.in);
		return o.nextLine();
	}
	
	public String obg(String g)
	{
		//this.ob("OBG");
		
		this.ob(g);
		return this.og();
	}
	
	public void orb()
	{
		//this.ob("ORB");
		
		for (String r : r0b1)
		{
			this.ob(r);
		}
	}
	
	public void orpi()
	{
		//this.ob("ORPI");
		
		this.ob(r0pi0);	
	}
	
	public void orr()
	{		
		File pir = new File("C:\\Users\\Andrew\\eclipse-workspace\\C2cScope\\src\\script.txt");
		try 
		{
			this.o = new Scanner(new File(rpi));
			if (pir.createNewFile())
			{				
				while (o.hasNextLine()) this.ob(o.nextLine());				
			}
		}
		catch (IOException e) 
		{
			try 
			{
				pir.createNewFile();
			} 
			catch (IOException e1) 
			{
				e1.printStackTrace();
			}
		}
		  
		
		 
		//Write Content
		try {
			
			FileWriter pio = new FileWriter(pir);
			String[] ry = {"r", "o", "y", "g", "b", "p", "pi"};
			
			for (int y = 0; y < 7; y++)
			{
				pio.write(ry[y]);
			}
			
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		//writer.write("Test data");
		//writer.close();
		
		
	}
	
}
