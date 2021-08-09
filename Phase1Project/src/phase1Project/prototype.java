package phase1Project;
import java.util.Scanner;
import java.io.File;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public class prototype {

	public static void main(String[] args) {
		
	// We Start the prototype calling the landing page and from there we take the users input for what he wants to do
		
		landingPage();
		
		}
	
	// The Methods to be used in the prototype 

	 // this method show the landing page and request the user to choose what he wants to do and then take him to the option he choosed
	 static void landingPage() {
		
		// Printing the Prototype Landing Page and asking the user for an input
		
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
		System.out.println("                          Devolped by : Lockers Pvt. Ltd.");
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("**********************************************************************************");
		System.out.println("**********************************************************************************");
		
		
		
		// Identifying the variable to be used in choosing the option and reading input from user
		Scanner obj = new Scanner(System.in);
		int mainch = obj.nextInt();
		
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
					landingPage();
				}
		
		
	}
	 
	 // this method shows the control files page and request the user to choose what he wants to do and then take him to the option he choosed
	 static void controlFiles () {
		 
		 // printing out the control files menu and asking the user for an input
		 
		 System.out.println("**********************************************************************************");
		 System.out.println("**********************************************************************************");
		 System.out.println();
		 System.out.println();
		 System.out.println();
		 System.out.println("                                  Lockers Pvt. Ltd.");
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
		 
		 // Reading input from user
		 Scanner obj = new Scanner(System.in);
		 int contch = obj.nextInt();
		 
		 // switch case to control the files
		 
		 switch (contch) {
		 
		 case 1 :
			 addFile();
			 return;
			 
		 case 2:
			 deleteFile();
			 return;
			 
		 case 3:
			 searchFile();
			 return;
			 
		 case 4:
			 landingPage();
			 return;
			 
		 default :
			 System.out.println("Please Enter a Valid Number");
			controlFiles();
		 }
	 }

	 // This method print out the file in the assigned path in ascending order
	 static void viewFiles() {
		
		 // Declaring the files path
		 File fileDir = new File("C:\\Users\\hadlagak\\Desktop\\Test");
		 // seraching the files and sorting them in ascending order
			if(fileDir.isDirectory()){
				List<String> listFile = Arrays.asList(fileDir.list());		
				Collections.sort(listFile);
				// printing out the results
				System.out.println("---------------------------------------");
				System.out.println("Here Are Your Files");
				for(String s:listFile){
					System.out.println(s);}}
			else{
				System.out.println(fileDir.getAbsolutePath() + " is not a directory");
			}
			//return the user to the landing page after showing the results
			
			System.out.println();
			System.out.println();
			System.out.println("---------------------------------------");
			System.out.println();
			System.out.println();
			landingPage();
			
			}
			
	 // this method allows the user to add new file
	 static void addFile () {
		
	}

	 // this method allows the user to delete an exiting file
	 static void deleteFile () {
		 
	 }

	 // this method allows the user to search for an exiting file
	 static void searchFile () {
		 
	 }

	 // this method is used to exit the prototype
	 static void closeApp ( ) {
		 
	 }
}


