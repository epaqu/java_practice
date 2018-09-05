public class FingerPrint
{
	public static void insertionSort (int[] numbers)
	{
		for (int index = 1; index < numbers.length; index++)
		{
			int key = numbers[index]; int position = index;
			while (position > 0 && numbers[position-1] > key)
				numbers[position] = numbers[position-1]; position--;
			numbers[position] = key;
		}
	}
	public static void jollySort (int[] numbers)
	{
		int temp;
		for (int i = 1; i < numbers.length; i += 2)
		{
			temp = numbers[i+1];
			numbers[i+1] = numbers[i];
			numbers[i] = temp;
		}
	}
	public static void main (String[] args)
	{
		int[] myArray = {1, 2, 4, 5, 6, 3, 10, 9, 7, 8,
						13, 14, 12, 11, 15, 18, 17, 16,
						19, 22, 25, 34, 28, 32, 38};
		insertionSort(myArray);
		jollySort(myArray);
		for (int i = 0; i < myArray.length; i++)
			System.out.println(myArray[i]);
	}
}
