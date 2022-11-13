package interview;


import java.util.Scanner;

public class StringClass {


	
	public static void main(String[] args) {
		
		
		  Scanner scan = new Scanner(System.in);
		    String shoppingListReport = "";
		    String item = "";
		    String countinue = "";
		    double price = 0;
		    int count = 1;
		    double totalPrice = 0;
		    
		    String str = "   all good ";
		    
		    str.replace(" ", "");

		    
		    
		     do
		       {
		         System.out.println("Enter Item" + (count) + " and its price:");
		         item = scan.next();
		         price = scan.nextDouble();
		         System.out.println("Do you want to add another item?");
		         countinue = scan.next();
		         if(countinue.equalsIgnoreCase("yes")) {
		         shoppingListReport = shoppingListReport + ("Item" + count + ": " + item + " Price: " + price + ", ");
		         }else {
		        	 shoppingListReport = shoppingListReport + ("Item" + count + ": " + item + " Price: " + price);
		         }
		         count++;
		         totalPrice = totalPrice + price;
		       }
		       while (countinue.equalsIgnoreCase("yes") && count <= 10);

		       
        
		
		System.out.println("Total Price: " + totalPrice);
		System.out.println(shoppingListReport);
		

	}
	
	
	
}
