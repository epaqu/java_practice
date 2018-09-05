//importing necessary utility
import java.util.ArrayList;

public class GarageDriver {
	public static void main (String[] args)
	{
		//initializing an arraylist of Auto's
		ArrayList<Auto> aGarage = new ArrayList<Auto>();
		//declaring defaultAuto as a Camry that has run 15 miles
		//and used up 100 gallons of gas.
		Auto defaultAuto = new Auto("Carmy", 15, 100.0);
		//declaring mustang as a Musatng that has run 38 miles
		//and used up 1800 gallons of gas.
		Auto mustang = new Auto("Mustang", 38, 1800.0);
		//use for loop to fill in the first 37 cars with Camry.
		for (int i = 0; i < 37; i++)
			aGarage.add(defaultAuto);
		//use for loop to fill in the last 52 cars with Mustang.
		for (int i = 37; i < 89; i++)
			aGarage.add(mustang);
		//the following code is just to see if the class Garage
		//works with no problem.
		Garage firstGarage = new Garage(aGarage);
		System.out.println(firstGarage.averageMiles());
		System.out.println(firstGarage.garageStatus());
		System.out.println(firstGarage.totalGallons());
		System.out.println(aGarage.get(2).getModel());
	}
}
