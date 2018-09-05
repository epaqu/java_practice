//importing necessary utilities
import java.util.ArrayList;

public class Garage
{
	//initializing an arraylist of Auto's.
	private ArrayList<Auto> garage = new ArrayList<Auto>();
	//a constructor
	public Garage(ArrayList<Auto> myGarage)
	{
		garage = myGarage;
	}
	//a method for calculating average miles of all the cars in garage.
	public double averageMiles()
	{
		double avg = 0.0;
		//use for loop to add up all the miles driven
		for (int i = 0; i < garage.size(); i++)
			avg += (double) garage.get(i).getMilesDriven();
		//divide the total miles by the size of the arraylist, which is
		//the number of cars
		avg /= garage.size();
		return avg;
	}
	//a method that returns the status of garage.
	public String garageStatus()
	{
		//when there are more than or equal to 100 cars in the garage,
		if (garage.size() >= 100)
			//the garage is full.
			return "full";
		//when there are less than 100 but more than 25 cars,
		else if (garage.size() > 25)
			//the garage is normally filled.
			return "normal load";
		//when there are less than or equal to 25 cars,
		else
			//the garage is unusually empty
			return "below minimum";
	}
	//method for getting the total amount of gallons
	public double totalGallons()
	{
		double total = 0.0;
		//use for loop to add up all the GallonsOfGas
		for (int i = 0; i < garage.size(); i++)
			total += garage.get(i).getGallonsOfGas();
		//return the total value
		return total;
	}
}
