public class Name
{
	private String first;
	private String middle;
	private String last;
	
	public Name(String myFirst, String myMiddle, String myLast)
	{
		first = myFirst;
		middle = myMiddle;
		last = myLast;
	}
	
	public String getFirst()
	{
		return first;
	}	
		
	public String getMiddle()
	{
		return middle;
	}
	
	public String getLast()
	{
		return last;
	}
	
	public void setFirst(String firstName)
	{
		first = firstName;
	}
	
	public void setMiddle(String middleName)
	{
		middle = middleName;
	}
	
	public void setLast(String lastName)
	{
		last= lastName;
	}
	
	public String toString()
	{
		return (first + " "+ middle +" " + last);
	}
}