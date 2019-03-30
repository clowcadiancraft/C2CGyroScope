import java.io.IOException;

public class Sulci extends R{
	
	public static R r = new R();

	public Sulci() throws IOException {
		main(null);
	}

	public static void main(String[] args) throws IOException {
		r.ob("SULCI");
		for (int neurons = 0; neurons < 6; neurons++)
		{
			Neuron.main(null);
		}
	}

}
