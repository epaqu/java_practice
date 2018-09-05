
public class vehicleClient {
	
	public static void main(String args[])
	{
		Vehicle a = new bicycle("Kang", 2, 10);
		Vehicle b = new bicycle ("Lee", 2, 5);
		
		Vehicle c = new motorizedVehicle("Ted", 4, 2000);
		Vehicle d = new motorizedVehicle("Barney", 4, 6000);
		
		System.out.println(a.getName() + "'s horse power of vehicle is " + a.horsePower());
		System.out.println(b.getName() + "'s horse power of vehicle is " + b.horsePower());
		System.out.println(c.getName() + "'s horse power of vehicle is " + c.horsePower());
		System.out.println(d.getName() + "'s horse power of vehicle is " + d.horsePower());
	}

}
