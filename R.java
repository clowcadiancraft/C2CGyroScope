import java.util.Scanner;

public class R {
	
	public R() {}

	public void b(String g)
	{
		System.out.println(g);		
	}
	
	public String g()
	{
		Scanner o = new Scanner(System.in);
		return o.nextLine();
	}
	
	public String bg(String g)
	{
		this.b(g);
		return this.g();
	}
	
}
