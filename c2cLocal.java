import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class c2cLocal 
{
	
	String[] patterns = new String[6];
	String pattern = "";
	
	public c2cLocal()
	{
		try 
		{
			
			BufferedReader patReader = new BufferedReader(new FileReader(
					"C:/Users/Andrew/eclipse-workspace/C2cScope/src/BasePatterns.txt"));
			for (int i = 0; i < pattern.length(); i++)
			{
				this.patterns[i] = patReader.readLine();
				//System.out.println(categories[i]);
			}
			patReader.close();
			
		} 
		catch (FileNotFoundException e) {
			
			e.printStackTrace();
			
		} catch (IOException e) 
		{
			e.printStackTrace();
		}
	}

}