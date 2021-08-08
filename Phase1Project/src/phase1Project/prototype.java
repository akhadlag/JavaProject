package phase1Project;
import java.util.Scanner;
public class prototype {

	public static void main(String[] args) {
		
		int mainch=0;
		landingPage();
		
		// switch case to choose from the landing page
		
		switch (mainch) {
		
		case 1:
			viewFiles();
				return;
			
		case 2:
			controlFiles();
				return;
			
		case 3:
			closeApp();
				return;
			
		default:
			System.out.println("Please Enter a Valid Number");
		}}
	
	// The Methods to be used in the prototype 

	 static void landingPage() {
		
		// Printing the Prototype menu and asking the user for an input
		
		System.out.println("**********************************************************************************");
		System.out.println("**********************************************************************************");
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("                                  lockedme.com");
		System.out.println();
		System.out.println();
		System.out.println("                        Please choose from the options below");
		System.out.println("                              1-To view the files");
		System.out.println("                              2-To Control the files");
		System.out.println("                              3-To Close the application");
		System.out.println();
		System.out.println();
		System.out.println("                          Devolped by : Abdulaziz AlHadlag");
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("**********************************************************************************");
		System.out.println("**********************************************************************************");
		
		
		
		// Identifying the variable to be used in choosing the option and reading input from user
		Scanner obj = new Scanner(System.in);
		int mainch = obj.nextInt();
		
		
	}
	 
	 static void controlFiles () {
		 
		 // printing out the control files menu and asking the user for an input
		 
		 System.out.println("**********************************************************************************");
		 System.out.println("**********************************************************************************");
		 System.out.println();
		 System.out.println();
		 System.out.println();
		 System.out.println("                                  lockedme.com");
		 System.out.println();
		 System.out.println();
		 System.out.println("                        Please choose from the options below");
		 System.out.println("                              1-To Add a New File");
		 System.out.println("                              2-To Delete an exiciting file");
		 System.out.println("                              3-To Search for a File");
		 System.out.println("                              4-to get back to the main menu");
		 System.out.println();
		 System.out.println();
		 System.out.println("                          Devolped by : Abdulaziz AlHadlag");
		 System.out.println();
		 System.out.println();
		 System.out.println();
		 System.out.println("**********************************************************************************");
		 System.out.println("**********************************************************************************");
		 
	 }

	 static void viewFiles() {
		
		 
		
	}
	
	 static void addFile () {
		
	}

	 static void deleteFile () {
		 
	 }

	 static void serachFile () {
		 
	 }

	 static void closeApp ( ) {
		 
	 }
}


