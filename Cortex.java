import java.io.IOException;

public class Cortex extends R{
	
	public static R r = new R();

	public Cortex() throws IOException {
		main(null);
	}

	public static void main(String[] args) throws IOException {
		r.b("Cortex");
		for (int sulcus = 0; sulcus < 6; sulcus++)
		{
			Sulci.main(null);
		}
		C2cScope.main(null);
	}

}
