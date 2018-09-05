public class Date
{
	private int month;
	private int date;
	private int year;
	
	public Date(int myMonth, int myDate, int myYear)
	{
		month = myMonth;
		date = myDate;
		year = myYear;
	}
	
	public int getMonth()
	{
		return month;	
	}
	
	public int getDate()
	{	
		return date;
	}
	
	public int getYear()
	{
		return year;
	}
	
	public void setMonth(int myMonth)
	{
		month = myMonth;
	}
	
	public void setDate(int myDate)
	{
		date = myDate;
	}
	
	public void setYear(int myYear)
	{
		year= myYear;
	}
	
	public String toString()
	{
		return (month + "/" + date + "/" + year);
	}
}