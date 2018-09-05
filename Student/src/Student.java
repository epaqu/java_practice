public class Student
{
	int score1, score2, score3;
	public void setTestScore (int testNumber, int testScore)
	{
		if (testNumber == 1)
			score1 = testScore;
		else if (testNumber == 2)
			score2 = testScore;
		else if (testNumber == 3)
			score3 = testScore;
	}

	private String firstName, lastName;
	private Address homeAddress, schoolAddress;

   //-----------------------------------------------------------------
   //  Sets up this Student object with the specified initial values.
   //-----------------------------------------------------------------
   public Student (String first, String last, Address home, Address school, int s1, int s2, int s3)
   {
      firstName = first;
      lastName = last;
      homeAddress = home;
      schoolAddress = school;
      score1 = s1;
      score2 = s2;
      score3 = s3;
   }

   //-----------------------------------------------------------------
   //  Returns this Student object as a string.
   //-----------------------------------------------------------------
   public String toString()
   {
      String result;

      result = firstName + " " + lastName + "\n";
      result += "Home Address:\n" + homeAddress + "\n";
      result += "School Address:\n" + schoolAddress;

      return result;
   }
}
