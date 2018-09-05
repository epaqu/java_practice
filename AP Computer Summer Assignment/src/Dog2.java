class Dog2
{
	private int age;
	private int weight;

	public Dog2(int howOld, int howBig)
	{
		age = howOld;
		weight = howBig;
	}

	public int getWeight()
	{
		return weight;
	}

	public void setWeight(int newWeight)
	{
		weight = newWeight;
	}

	public int getAge()
	{
		return age;
	}

	public static void main(String[] args)
	{
		Dog2 fido = new Dog2(5,10);
		System.out.println("Fido is " + fido.getAge() + " years old.");
		System.out.println("He weighs " + fido.getWeight() + " pounds." );
		fido.setWeight(20);
		System.out.println(
                 "Oops! Now he weighs " + fido.getWeight() + " pounds." );
	}
}
