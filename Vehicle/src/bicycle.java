
public class bicycle extends Vehicle{
	
	public bicycle(String nameOfOwner, int numWheels, int engineVolumeDisplacement)
	{
		super();
		name = nameOfOwner;
		wheels = numWheels;
		evd = engineVolumeDisplacement;
	}

	public int horsePower() {
		return wheels*evd;
	}

}
