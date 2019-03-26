import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class c2cLocal 
{
	
	String[] bases = {"foundation", "passion", "manifestation", "compassion",
			"expression", "obsevation", "conception"};
	String basesString = "foundation, passion, manifestation, compassion, "
			+ "expression, obsevation, conception";
	
	String[] patterns = new String[6];
	String row = "";
	String theme = "";
	
	public c2cLocal()
	{
		try 
		{			
			BufferedReader patReader = new BufferedReader(new FileReader(
					"C:/Users/Andrew/eclipse-workspace/C2cScope/src/BaseCategories.txt"));
			for (int i = 0; i < patterns.length; i++)
			{
				this.patterns[i] = patReader.readLine();
				//System.out.println(this.patterns[i]);
			}
			patReader.close();
			
		} 
		catch (FileNotFoundException e) {e.printStackTrace();} 
		catch (IOException e) {e.printStackTrace();		}
	}
	
	public String getPattern(int intent)
	{
		String[] categories = new String[37];	
		for (int patStrt = 0; patStrt < 6; patStrt++)
			this.patterns = categories[intent * 6 + 1];
		this.row = String.join(",", name);
		return this.row = this.patterns[rowNum];		
	}
	
	public String getTheme(int intent, int passion) {
		return this.theme = this.categories[intent*passion];
	}
	public String getTheme(int id) {
		return this.theme = this.categories[id];
	}


}
