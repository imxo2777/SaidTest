package interview;

public class TwoDArrays {

	public static void main(String[] args) {
		/*
		 * Create an array of countries: north America countries, south America
		 * countries, European countries, Asian countries, African countries. Then print
		 * all values from that array using 2 different loops and calculate how many
		 * total countries been stored.
		 */

		String[][] countries = { 
				{ "USA", "Greenland", "Cuba", "Canada","Mexico" },
				{ "Brazil", "Colombia", "Argentina", "Peru","Tunisia" }, 
				{ "Italy", "France", "Denmark", "Austria" },
				{ "China", "Uzbekistan", "Japan", "India" } 
				};
		
		for(String[] arr : countries) {
			for(String country : arr ) {
				System.out.print(country + " ");
			}
			System.out.println();
		}
		
		System.out.println("========================================================== ");

		for(int i = 0; i < countries.length; i++) {
			for(int j = 0; j < countries[i].length; j++) {
				System.out.print(countries[i][j] + " ");
			}
			System.out.println();
		}
		
		
		System.out.println(countries.length);  // the number of arrays in the 2d array
		
		System.out.println(countries[1].length); // the number of elements in the second array in 2d array
		
		int sum = 0;
		
		for(int i = 0; i < countries.length; i++) {
			sum = sum + countries[i].length;
		}
		
		System.out.println(sum);
		
		
		
  int  min, max;
		
		int[][] numbers = {  {3,4,67,8},
					 		 {21,3,9,12},
					 		 {32,5,15,80},
					 		 {29,35,2,1}    };
		max = numbers[0][0];
		min = numbers[0][0];
		int secondLargest = numbers[0][0];
		for (int i = 0; i < numbers.length; i++)
		{
			for(int j = 0; j < numbers[i].length; j++) {
				if(max < numbers[i][j]) {
					max = numbers[i][j];
				}if(min > numbers[i][j]) {
					min = numbers[i][j];
				}
			}
		}
		System.out.println("The largest number is " + max + " Minimum is -> " + min + " Second largest -> " + secondLargest);

		for (int i = 0; i < numbers.length; i++)
		{
			for(int j = 0; j < numbers[i].length; j++) {
				if(secondLargest < numbers[i][j] && numbers[i][j]!=max) {
					secondLargest = numbers[i][j];
				}
			}
		}
      
		System.out.println("second largest -> " + secondLargest);
		
	}
}
