import java.io.IOException;

public class Cortex {

	public Cortex() throws IOException {
		main(null);
	}

	public static void main(String[] args) throws IOException {
		System.out.println("CORTEX");
		for (int sulcus = 0; sulcus < 6; sulcus++)
		{
			Sulci.main(null);
		}
		C2cScope.main(null);
	}

}
