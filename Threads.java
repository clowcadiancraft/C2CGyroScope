import java.io.IOException;

public class Threads extends R{
	
	public static R r = new R();
	
	public String threads;

	public Threads() throws IOException 
	{
		main(null);
	}

	public static void main(String[] args) throws IOException 
	{		
		r.rb[0] = r.obg("Please enter current state: ");
		r.rb[1] = r.obg("Please enter previous state: ");
		r.rb[2] = r.obg("Please enter optimum state: ");
	}
}
