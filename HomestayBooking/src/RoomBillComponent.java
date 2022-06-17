
public interface RoomBillComponent {

	public double tax = 12.0;
	public double extra_person_charge = 500.0;
	public double food_charge = 800.0;
	
	public float calculateBill();
}
