import java.io.IOException;

public class Cortex extends R{
	
	public static R r = new R();

	public Cortex() throws IOException {
		main(null);
	}

	public static void main(String[] args) throws IOException {
		
		String Intention;
		
		//NEED REVISITING DUE TO MULTIPLE UNIQUE OBJECTS
		r.r0pi0 += "pi0";
		r.ob("CORTEX");
		
		//if()
		
		for (int sulcus = 0; sulcus < 6; sulcus++)
		{
			Sulci.main(null);
		}
		
		C2cScope.main(null);
	}

}
