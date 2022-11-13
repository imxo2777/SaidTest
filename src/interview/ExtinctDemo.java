package interview;

import java.util.Scanner;

public class ExtinctDemo {

	
	public static void main(String[] args) {
		
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Write the number of inhabitats: ");
		
	    int inhabitants = scan.nextInt();

		int day = 0;
	    
	        System.out.println("Day [0] = " + inhabitants);
	        
			do {
				//inhabitants = inhabitants/2;
				day++;
				if(inhabitants % 2 == 0) {
					inhabitants = inhabitants/2;
					System.out.println("Day [" + (day) + "] = " + inhabitants);
				}else if(inhabitants % 2 == 1){
					inhabitants = (inhabitants % 2) - inhabitants/2 + 1;
				System.out.println("Day [" + (day) + "] = " + inhabitants);	  
				}
				
			}while(inhabitants <= 1);
		
			System.out.println("---- EXTINCT ----");
			
			scan.close();
	}
	
}
