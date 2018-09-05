
public class motorizedVehicle extends Vehicle{

	public motorizedVehicle(String nameOfOwner, int numWheels, int engineVolumeDisplacement)
	{
		super();
		name = nameOfOwner;
		wheels = numWheels;
		evd = engineVolumeDisplacement;
	}
	

	public int horsePower() {
		
		return evd * wheels;
	}

}
