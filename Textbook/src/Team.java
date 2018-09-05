
public class Team
{
	public String name;
	public Double rate;
	public String position;
	public Team()
	{
	}
	public Team(Player[] player, int k)
	{
		name = player[k].getNM();
		rate = player[k].getRT();
		position = player[k].getPos();
	}
	public String getName()
	{
		return name;
	}
	public double getRate()
	{
		return rate;
	}
	
	public String getPosition()
	{
		return position;
	}
	public void setNM(String myName)
	{
		name = myName;
	}
	
	public void setRT(double myRate)
	{
		rate = myRate;
	}
	
	public void setPos(String myPosition)
	{
		position = myPosition;
	}	
	public String toString()
	{
		return ("Name: " + name + "\nPosition: " + position + "\nBatting Rate: " + rate + "%");
	}
	public boolean posCheck(Player[] x)
	{
		for (int i = 0; i < x.length; i++)
			if (x[i].pos.equals(x[i+1].pos))
					return false;
		return true;
	}
	public double percentageTeam(Player[] x)
	{
		double perc = 0.0;
		for (int i = 0; i < x.length; i++)
			perc += x[i].rt;
		perc /= x.length;
		return perc;
	}
	public boolean pitcherCheck(Player[] x)
	{
		for (int i = 0; i < x.length; i++)
		{
			if (x[i].getPos().equals("Pitcher"))
				return true;
		}
		return false;
	}
	public boolean equals(Player x, Player y)
	{
		if(x.getNM().equals(y.getNM()))
			return true;
		else
			return false;
	}
	public boolean personCheck(String person, Player[] x)
	{
		for (int i = 0; i < x.length; i++)
		{
			if (x[i].nm.equals(person))
				return true;
		}
		return false;
	}
	public Player[] ascendingRate(Player[] x)
	{
		Player[] result = new Player[x.length];
		double smallest = x[0].getRT();
		for (int i = 0; i < x.length; i++)
		{
			for (int j = 0; j < x.length; j++)
			{
				if (x[j].getRT() < smallest)
				{
					smallest = x[j].getRT();
					result[i] = x[j];
				}
			}
		}
		return result;
	}
}