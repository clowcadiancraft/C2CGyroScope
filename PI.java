import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class PI extends R{

	public PI() {
		File pir = new File("C:\\Users\\Andrew\\eclipse-workspace\\C2cScope\\src\\script.txt");
		try 
		{
			this.o = new Scanner(new File(rpi));
			if (pir.createNewFile())
			{				
				while (o.hasNextLine()) this.ob(o.nextLine());				
			}
			else this.ob("dd");
		}
		catch (IOException e) 
		{
			try 
			{
				pir.createNewFile();
				
				FileWriter pio = new FileWriter(pir);
				String[] ry = {"r", "o", "y", "g", "b", "p", "pi"};
				
				for (int y = 0; y < 7; y++)
				{
					pio.write(ry[y]+"\n#0\n");
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

}
