
public class Baseball {
	public Player[] myTeam;
	public String name;
	private Double batting;
	public String position;
	public Baseball()
	{
	}
	public Baseball(Player[] x)
	{
		myTeam = new Player[x.length];
		for (int i = 0; i < myTeam.length; i++)
		{
			myTeam[i] = x[i];
		}
	}
	public String getName()
	{
		return name;
	}
	public String getPos()
	{
		return position;
	}
	public double getBat()
	{
		return batting;
	}
	public void setName()
	{
		
	}
	public void setPos()
	{
		
	}
	public void setBat()
	{
	}
	public String toString()
	{
		String x = "";
		return x;
	}
	public boolean equals()
	{
		boolean checker = true;
		return checker;
	}
	public boolean posChekcer()
	{
		boolean posCheck = true;
		return posCheck;
	}
	public void sortAscending()
	{

	}
	
	public static void main (String[] args)
	{
		
	}
}
