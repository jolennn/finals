import java.util.Scanner;

public class imp {
	
	Scanner in = new Scanner();
	public int ctr = 0;
	
	public void fillOut(){
		
		counter++;
		information driver = new information();
		
		System.out.println("Please fill out the following: ");
		System.out.println("Plate number: ");
		driver.plate = in.nextLine();
		System.out.println("Driver name: ");
		driver.name = in.nextLine();
		System.out.println("Car brand: ");
		driver.brand = in.nextLine();
		System.out.println("Car color: ");
		driver.color = in.nextLine();
		System.out.println("Time parked: ");
	}
	
}