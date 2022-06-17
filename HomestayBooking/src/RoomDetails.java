
public class RoomDetails implements RoomBillComponent{

	public int billId;
	public String custommerName;
	public String typeOfRoom;
	public int noOfExtraPersons;
	public int noOfDaysOfStay;
	public static int counter;
	
	static {
		counter = 101;
	}
	
	public RoomDetails(String custommerName,String typeOfRoom,int noOfExtraPersons,int noOfDaysOfStay) {
		this.billId = counter++;
		this.custommerName = custommerName;
		this.typeOfRoom = typeOfRoom;
		this.noOfExtraPersons = noOfExtraPersons;
		this.noOfDaysOfStay = noOfDaysOfStay;
	}
	
	public int getBillId() {
		return billId;
	}
	public void setBillId(int billId) {
		this.billId = billId;
	}
	public String getCustommerName() {
		return custommerName;
	}
	public void setCustommerName(String custommerName) {
		this.custommerName = custommerName;
	}
	public String getTypeOfRoom() {
		return typeOfRoom;
	}
	public void setTypeOfRoom(String typeOfRoom) {
		this.typeOfRoom = typeOfRoom;
	}
	public int getNoOfExtraPersons() {
		return noOfExtraPersons;
	}
	public void setNoOfExtraPersons(int noOfExtraPersons) {
		this.noOfExtraPersons = noOfExtraPersons;
	}
	public int getNoOfDaysOfStay() {
		return noOfDaysOfStay;
	}
	public void setNoOfDaysOfStay(int noOfDaysOfStay) {
		this.noOfDaysOfStay = noOfDaysOfStay;
	}
	
	public boolean validateNoOfDaysOfStay(int noOfDaysOfStay) {
		
		if(noOfDaysOfStay > 0 && noOfDaysOfStay < 16 ) {
			return true;
		}
		else {
			System.out.println("\nThe No of Days of Accomodation should be between 1 to 15!");
			return false;
		}
	}
	
	public boolean validateNoOfExtraPerson(int noOfExtraPersons) {
		
		if(noOfExtraPersons > 2 ) {
			System.out.println("\nMore than 2 extra persons not allowed per room!");
			return false;
		}
		else 
		return true;
	}
	
	public boolean validateTypeOfRoom(String typeOfRoom) {
		
		if("Standard".compareToIgnoreCase(typeOfRoom) == 0) {
			System.out.println("\nThe room type is Standard ");
			return true;
		}
		else if("Deluxe".compareToIgnoreCase(typeOfRoom)== 0) {
			System.out.println("\nThe room type is Deluxe ");
			return true;
		}
		else if("Cottage".compareToIgnoreCase(typeOfRoom)== 0) {
			System.out.println("\nThe room type is Cottage ");
			return true;
		}
		else {
			System.out.println("\nThe room type selected is not valid !");
			return false;
		}
		
	}
	
	public float calculateBill() {
		
		float totalBill = 0;
		
		if(validateTypeOfRoom(typeOfRoom)) {
			if(validateNoOfDaysOfStay(noOfDaysOfStay)) {
				if(validateNoOfExtraPerson(noOfExtraPersons)) {
					if("Standard".compareToIgnoreCase(typeOfRoom) == 0 ) {
						totalBill = (float) ((noOfDaysOfStay*2500) +noOfDaysOfStay *( food_charge) +
								(extra_person_charge* noOfExtraPersons));
					}
					if("Deluxe".compareToIgnoreCase(typeOfRoom) == 0 ) {
						totalBill = (float) ((noOfDaysOfStay*3500) +noOfDaysOfStay *( food_charge) +
								(extra_person_charge* noOfExtraPersons));
					}
					if("Cottage".compareToIgnoreCase(typeOfRoom) == 0 ) {
						totalBill = (float) ((noOfDaysOfStay*5500) +noOfDaysOfStay *( food_charge) +
								(extra_person_charge* noOfExtraPersons));
					}
				}
			}
		}
		
		totalBill = (float) (totalBill + totalBill*tax);
		return totalBill;
	}
	
}
