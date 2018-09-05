
public class Chick implements Animal
{
	private String myType;
	private String mySound, mySound2;

	Chick()
	{
			myType = "chick";
			mySound = "cluck";
			mySound2 = "cluck";
	}
	Chick(boolean bothSound)
	{
		myType = "chick";
		mySound2 = "cheep";
		mySound = "cluck";
	}
	
	public String getSound()
	{
		double prob = 2 * Math.random();
		if (prob >= 1)
			return mySound;
		else
			return mySound2;
	}
	public String getType()
	{
		return myType; 
	}
}
