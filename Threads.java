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
		String state, rew, forw;
		
		state = r.bg("Please enter current state: ");
		r.b(state);
	}
}
