import java.util.Scanner;

public class R {
	
	public String rb[] = new String[3];
	
	public R() {}
	
		public void ob(String g)
	{
		System.out.println(g);		
	}
	
	public String og()
	{
		Scanner o = new Scanner(System.in);
		return o.nextLine();
	}
	
	public String obg(String g)
	{
		this.ob(g);
		return this.og();
	}
	
}
