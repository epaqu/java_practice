
public class DailyTemperatureDriver {
	public DailyTemperatureDriver()
	{
	}
	
	public static void main (String [] args)
	{
		
		double[] anArray = {15.0, 37.2, 100.3, 88.9, 88.9, 230.5, 87.4};
		DailyTemperature daily = new DailyTemperature (anArray);
		System.out.println(daily.toString());
		System.out.println("The first day's teeperature was: " + daily.getTemp(0));
		System.out.println("Oops! There was a change in the record.");
		daily.setTemp(1, 105.0);
		System.out.println(daily.toString());
		System.out.println("Temperature was same for the fourth and fifth day? " + daily.equals(3, 4));
		System.out.println("Number of Temperatures below  the freezing point: " + daily.howManyBelow());
		System.out.println("Number of Temperatures above the boiling point: " + daily.howManyAbove());
		System.out.println("The largest change in temperautre was " + daily.largestChange());
	}
}