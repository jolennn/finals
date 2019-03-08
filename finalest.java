import java.util.Scanner;

public class finalest {
	
	public static void main(String []args){
		
		Scanner input = new Scanner(System.in);
		int choice;
		information customer = new information();
		do {
			
			System.out.println("Welcome to Car Park Simulator");
			System.out.println("Enter 1 for Park");
			System.out.println("Enter 2 for Exit");
			System.out.println("Enter 3 to terminate program");
			choice = input.nextInt();
			
			switch(choice){
				case 1:{
					printSpace();
					System.out.println("Legend: ");
					System.out.println("Numbers = Parking Spot Free");
					System.out.println("1 = Parking Spot Taken");
					System.out.println("0 = Driveway");
					System.out.println("Please input parking space number: ");
					
					//parking space number
					int area = input.nextInt();
					
					//new node containing the information
					imp.fillOut();
					System.out.println("Time parked: "); // if possible system na ang mag input ani
					//make text file
					
					System.out.println("Your car is safe with us!");
					break;
				}
				case 2:{
					System.out.println("Please input driver name: ");
					System.out.println("Time out: ");
					//remove from current linked list
					System.out.println("Thank you for trusting us with your car, Mr/Ms _______!");
					
					break;
				}
				case 3:{
					
					break;
				}
			}
		} while(choice!=3)
	}
	
}