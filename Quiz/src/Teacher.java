public class Teacher
{
	public Name name;
	public Date birthdate;
	private Double salary;
	private String rank;
	private String dept;
	
	public Teacher()  // default constructor
	{
		name = new Name ("Michael", "J", "Smith");
		birthdate = new Date (1,1,10);
		salary = 30000.00;
		rank = "Professor";
		dept = "Math Department";
	}
	
	// #1
	public Teacher(Name myName, Date myDate, Double mySalary, String myRank, String myDept)
	{
		name = myName;
		birthdate = myDate;
		salary = mySalary;
		rank = myRank;
		dept = myDept;
	}
	
	public Name getName()
	{
		return name;
	}
	public Double getSalary()
	{
		return salary;
	}
	
	public String getRank()
	{
		return rank;
	}
	
	public String getDept()
	{
		return dept;
	}
	
	public void setSalary(double mySalary)
	{
		salary = mySalary;
	}
	
	public void setRank(String myRank)
	{
		rank = myRank;
	}
	
	public void setDept(String myDept)
	{
		dept = myDept;
	}
	
	// #2
	public void initFaculty(Teacher[] faculty)
	{
	}

	// #3
	public Double incSalary()
	{
		double incAmt = 0.0;
		if (this.rank.equals("full professor"))
			incAmt = salary * 0.06;
		else if (this.rank.equals("associate professor"))
			incAmt = salary * 0.04;
		else if (this.rank.equals("assistant professor"))
			incAmt = salary * 0.02;
		else
			incAmt = 10.00;
		
		return incAmt;
	}
	
	// #4
	public static void incFaculty(Teacher[] fac)
	{
	  
	}

	// #5
	public static void printUnderpaid(Teacher[] faculty)
	{
	  	  
	}
	
	// #6
	/*
	public int getNumAssocProf(Teacher[] faculty)
	{
	 
	}	
	*/
	public String toString()
	{
		return ("Name: " + name + "\nBirthdate: " + birthdate + "\nSalary: " + salary + "\nRank: " + rank + "\nDepartment: " + dept);
	}

	public static void main (String [] args)
    {

	}
	

}