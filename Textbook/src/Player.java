
public class Player
{
	public String nm;
	public Double rt;
	public String pos;
	
	public Player(String myName, Double myRate, String myPosition)
	{
		nm = myName;
		rt = myRate;
		pos = myPosition;
	}
	
	public String getNM()
	{
		return nm;
	}	
		
	public Double getRT()
	{
		return rt;
	}
	
	public String getPos()
	{
		return pos;
	}
	public void setRate(double myRate)
	{
		rt = myRate;
	}

}