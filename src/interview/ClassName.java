package interview;

public class ClassName {

	
	//Create a class Student that will have a method getGrade.
//	Your method should accept the score of a student and return a grade:
//		score > 90 - A
//		score > 80 - B
//		score > 70 - C
//		score > 50 - D
//		anything else - F
//
	
//	Create a method createEmail(). Based on provided users firstName, lastName
//	 * and emailType, your method should return complete email address. Example:
//	 * firstName -> john lastName -> snow emailType -> gmail return ->
//	 * johnsnow@gmail.com
	
	public static String createEmail(String firstName, String lastName, String emailType) {
		
		String result = firstName.toLowerCase() + lastName.toLowerCase() + "@" + emailType.toLowerCase() + ".com";
		
		System.out.println(result);
		
		return result;
	}
	
	public static char getGrade(int score) {
		
		char result = 'A';
		
		if(score >= 90 && score <= 100) {
			result = 'A';
		}else if(score >= 80 && score < 90) {
			result = 'B';
		}else if(score >= 70 && score < 80) {
			result = 'C';
		}else if(score >= 50 && score < 70) {
			result = 'D';
		}else {
			result = 'F';
		}
		
		System.out.println(result);
		return result;
	}
	
	
	public static void main(String[] args) {
		
		getGrade(85);

		createEmail("SAID", "ALIMOV", "GMAIL");
		
	}
}
