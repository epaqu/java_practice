
public abstract class Vehicle {
	
	public String name;
	public int wheels;
	public int evd;
	public int hp;
	
	public abstract int horsePower();

	public String getName()
	{
		return name;
	}
	public int getWheels()
	{
		return wheels;
	}
	public int getVolumeDisplacement()
	{
		return evd;
	}
	
}
