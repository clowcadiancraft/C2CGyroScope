import java.io.IOException;

public class Sulci extends R{

	public Sulci() throws IOException {
		main(null);
	}

	public static void main(String[] args) throws IOException {
		System.out.println("SULCI");
		for (int neurons = 0; neurons < 6; neurons++)
		{
			Neuron.main(null);
		}
	}

}
