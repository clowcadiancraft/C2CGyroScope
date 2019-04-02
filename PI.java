import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class PI {
	
	public File pir = new File("C:\\Users\\Andrew\\eclipse-workspace\\C2cScope\\src\\script.txt");
	public Scanner o;
	public String[] ry = {"r", "o", "y", "g", "b", "p", "pi"};

	public PI(String rpi) {
		
		try 
		{
			this.o = new Scanner(new File(rpi));
			if (pir.createNewFile())
			{				
				while (this.o.hasNextLine()) R.ob(this.o.nextLine());				
			}
			else R.ob("dd");
		}
		catch (IOException e) 
		{
			try 
			{
				pir.createNewFile();
				
				FileWriter pio = new FileWriter(pir);
								
				for (int y = 0; y < 7; y++)
				{
					pio.write(this.ry[y]+"\n#0\n");
				}
				pio.close();
			} 
			catch (IOException e1) 
			{
				e1.printStackTrace();
			}
		}		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public void orr()
	{		
		
		
	}

}
