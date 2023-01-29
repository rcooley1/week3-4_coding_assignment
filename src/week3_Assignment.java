import java.util.*;
import java.util.List;

public class week3_Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
		
		//1a. Programmatically subtract the value of the first element in the array from the value in the last element of the array (i.e. do not use ages[7] in your code). Print the result to the console.  
		System.out.println(ages[ages.length-1] - ages[0]);
		System.out.println();
		//1b. Add a new age to your array and repeat the step above to ensure it is dynamic (works for arrays of different lengths).
		int[] newAges = {3, 9, 23, 64, 2, 8, 28, 93, 25};
		System.out.println(newAges[newAges.length-1] - newAges[0]);
		System.out.println();
		//1c. Use a loop to iterate through the array and calculate the average age. Print the result to the console. 
		int sum = 0;
		for (int i = 0; i < newAges.length; i++) {
			sum += i;
		}
		int average = sum/newAges.length;
		System.out.println(average);
		System.out.println();
		//2. Create an array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		
		//2a. Use a loop to iterate through the array and calculate the average number of letters per name. Print the result to the console.
		int namesSum = 0;
		for (int i = 0; i < names.length; i++) {
			namesSum += names[i].length();
		}
		System.out.println(namesSum/names.length);
		System.out.println();
		//2b. Use a loop to iterate through the array again and concatenate all the names together, separated by spaces, and print the result to the console.
		for(int i = 0; i < names.length; i++) {
			System.out.print(names[i] + " ");
		}
		System.out.println();
		System.out.println();
		
		//3. How do you access the last element of an array?
		System.out.println("3. Access the last element of an array by: (array[array.length -1];).");
		System.out.println();
		
		//4. How do you access the last element of an array?
		System.out.println("4. Access the first element of an array by: array[0];).");
		System.out.println();
		//5. Create a new array of int called nameLengths. Write a loop to iterate over the previously created names array and add the length of each name to the nameLengths array.
		int[] nameLengths = new int[names.length];
		for(int i = 0; i < names.length; i++) {
			nameLengths[i] = names[i].length();
		}
		for(int i = 0; i < names.length; i++) {
			System.out.print(nameLengths[i]+ " ");
		}
		System.out.println("");
		
		//6. Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array. Print the result to the console.
		System.out.println();
		int nameLengthsSum = 0;
		for(int i = 0; i < nameLengths.length; i++) {
			nameLengthsSum += nameLengths[i];
		}
		System.out.println(nameLengthsSum);
		
		//7ex. This is to test the method 'repeatWord'.
		System.out.println();
		System.out.println(repeatWord("Hello", 3));
		
		//8ex. This is to test the method 'combine names'.
		System.out.println();
		System.out.println(combineNames("Robert", "Cooley"));
		
		//9ex. This is to test the method 'greaterThan100'.
		System.out.println();
		int[] setOfNumbers = {5, 6, 10, 35, 50, 78};
		System.out.println(greaterThan100(setOfNumbers));
		
		//10ex. This is to test the method 'averageOfDoubles'.
		System.out.println();
		double [] arrayOfDouble = {1.0, 5.6, 7.9, 1.6, 8.5};
		System.out.println(averageOfDoubles(arrayOfDouble));
		
		//11ex. This is to test the method 'firstIsGreater'.
		System.out.println();
		double [] firstDoubleArr = {1.0, 5.6, 7.9, 1.6, 8.5};
		double [] secondDoubleArr = {5.5, 7.8, 9.8, 3.2, 6.5, 6.2, 9.0};
		System.out.println(firstIsGreater(firstDoubleArr, secondDoubleArr));
		
		//12ex. This is to test the method willBuyDrink.
		System.out.println();
		boolean isHotOutside = true;
		double moneyInPocket = 14.0;
		System.out.println(willBuyDrink(isHotOutside, moneyInPocket));
		
		
		
		
	}
	
	//7. Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to itself n number of times. (i.e. if I pass in “Hello” and 3, I expect the method to return “HelloHelloHello”).
	public static String repeatWord(String word, int n) {
		String repeatedWord = "";
		while(n > 0) {
			repeatedWord += word;
			n--;
		}
		return repeatedWord;
	}
	
	//8. Write a method that takes two Strings, firstName and lastName, and returns a full name (the full name should be the first and the last name as a String separated by a space).
	public static String combineNames(String firstName, String lastName) {
		String fullName = firstName.concat(" " + lastName);
		return fullName;
	}
	
	//9. Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100. 
	public static boolean greaterThan100(int[] setOfNumbers) {
		int sum = 0;
		for(int i = 0; i < setOfNumbers.length; i++) {
			sum += setOfNumbers[i];
		}
		return sum > 100;
	}
	
	//10. Write a method that takes an array of double and returns the average of all the elements in the array.
	public static double averageOfDoubles(double [] arrayOfDouble) {
		double sum = 0.0;
		for (double number: arrayOfDouble) {
			sum += number;
		}
		double arrayLength = arrayOfDouble.length;
		return sum/arrayLength;
	}

	//11. Write a method that takes two arrays of double and returns true if the average of the elements in the first array is greater than the average of the elements in the second array.
	public static boolean firstIsGreater(double[] firstDoubleArr, double[] secondDoubleArr) {
		double sum1 = 0;
		for (double number : firstDoubleArr) {
			sum1 += number;
		}
		double average1 = sum1/firstDoubleArr.length;
		
		double sum2 = 0;
		for (double number: secondDoubleArr) {
			sum2 += number;
		}
		double average2 = sum2/secondDoubleArr.length;
		
		return average1 > average2;
	}
	
	//12. Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, and returns true if it is hot outside and moneyInPocket is greater than 10.50.
	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		if (isHotOutside == true && moneyInPocket > 10.50) {
			return true;
		} else return false;
	}
	
	//13. Create a method of your own that solves a problem. In comments, write what the method does and why you created it.
	public static boolean willGoToMovies(boolean weekend, double moneyInWallet, boolean isHungry) {
		if(weekend == true && moneyInWallet > 30.00 && isHungry==true) {
			return true;
		} else {
			return false;
		}
	}
	//This method is used to determine if it is an appropriate night for me to go to the movies, as well as if I have enough for tickets and concessions. 
	
}

