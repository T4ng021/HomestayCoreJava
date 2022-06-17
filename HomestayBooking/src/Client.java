import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		
		String custName,typeOfRoom;
		int noOfExtraPersons,noOfDaysOfStay;
		float billAmount;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("****************************************");
		System.out.println("\tHomestay Booking");
		System.out.println("****************************************");
		System.out.println("Enter Customer name : ");
		custName = sc.next();
		System.out.println("Enter Type of room : ");
		typeOfRoom = sc.next();
		System.out.println("Enter no of extra persons : ");
		noOfExtraPersons = sc.nextInt();
		System.out.println("Enter no of days of stay : ");
		noOfDaysOfStay = sc.nextInt();
		
		RoomDetails room = new RoomDetails(custName,typeOfRoom,noOfExtraPersons,noOfDaysOfStay);
		billAmount = room.calculateBill();

		if(billAmount > 0) {
			System.out.println("****************************************");
			System.out.println("Bill Amount to be paid : " + billAmount);
			System.out.println("****************************************");
		}
		
		sc.close();
	}

}
