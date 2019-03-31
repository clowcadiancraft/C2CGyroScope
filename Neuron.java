import java.io.IOException;

public class Neuron extends R
{
	
	public static R r = new R();

	public Neuron() throws IOException 
	{
		main(null);
	}

	public static void main(String[] args) throws IOException 
	{
		
		r.r0pi0 = "b0";
		r.ob("NEURON");		
		
		r.r0b1[0] = r.obg("Please enter current state: ");
		r.r0pi0 += "g0";
		r.r0b1[1] = r.obg("Please enter previous state: ");
		r.r0pi0 += "g1";
		r.r0b1[2] = r.obg("Please enter optimum state: ");
		r.r0pi0 += "g2";
		
		r.orpi();
	}

}
