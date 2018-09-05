
public class DailyTemperature {
	public double[] tempList;
//constructor
	public DailyTemperature()
	{
		
	}
//constructor that accepts an array of seven double variables
	public DailyTemperature(double[] a)
	{
		tempList = a;
	}
//accessor method: get the temperature of (a+1)th element in the array
	public double getTemp(int a)
	{
		return tempList[a];
	}
//mutator method: changes the (a+1)th element of the array into (newTemp)
	public void setTemp(int a, double newTemp)
	{
		tempList[a] = newTemp;
	}
//displays the result in a string.
	public String toString()
	{
		String x = "Daily Temperatures: " + tempList[0] + ", " + tempList[1];
		x += ", " + tempList[2] + ", " + tempList[3] + ", " + tempList[4] + ", ";
		x += tempList[5] + ", " + tempList[6];
		return x;
	}
//a method that checks whether two of the temperatures in the array are same.
	public boolean equals(int z, int y)
	{
		//if [z]th element and [y]th element have same values,
		if (tempList[z] == tempList[y])
			//then they are equal so return true
			return true;
		//otherwise,
		else
			//then they are different so return false.
			return false;
	}
//a method that outputs how many temperatures are below freezing point.
	public int howManyBelow ()
	{
		int count = 0;
		for (double i : tempList)
			if (i < 32)
				count++;
		return count;
	}
//a method that outputs how many temperatures are above boiling point.
	public int howManyAbove ()
	{
		//initialize count as int 0.
		int count = 0;
		//using for loop to see if any of the elements are above 212.
		for (double i : tempList)
			//if the temperature is greater than 212
			if (i > 212)
				//then increase count by 1
				count++;
		return count;	
	}
//a method that outputs the largest difference between two consecutive temperatures.
	public double largestChange ()
	{
		//dif will be the difference between two consecutive elements.
		double dif;
		//initiates largest as the difference between the first and the second elements.
		double largest = Math.abs(tempList[1] - tempList[0]);
		//using for loop to find the largest
		for (int i = 0; i < tempList.length - 1; i++)
		{
			//get the diff. between two consecutive elements
			dif = Math.abs(tempList[i+1] - tempList[i]);
			//see if the diff is larger than current largest.
				//if yes, then change largest into dif.
				//if no, keep current largest.
			if (largest < dif)
				largest = dif;
		}
		return largest;
	}
}
