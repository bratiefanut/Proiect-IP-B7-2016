package checkBuilding;
import buildingInfo.*;

public class CapacityCheck {
	public static void checkRoomCapacity (Room R) {
		Integer numericValue = Integer.parseInt(R.getCapacity());
		if (numericValue <= 0) System.out.println("(" + R.getLabel() + ")Capacity is too small! (must be equal or greater than 1)");
		double w = Double.parseDouble(R.getWidth());
		double l = Double.parseDouble(R.getLength());
		if ((w*l / numericValue) / 2 > 5) System.out.println("Room (" + R.getLabel() + ") capacity is too big! (1 square meter holds at most 4 persons)");
		else System.out.println("Room (" + R.getLabel() + ") has good capacity.");
	}
	
	public static void checkDoorCapacity (Door D) {
		Integer numericValue = Integer.parseInt(D.getCapacity());
		if (numericValue <= 0) System.out.println("(" + D.getId() + ")Capacity is too small! (must be equal or greater than 1)");
		double w = Double.parseDouble(D.getWidth());
		if (w / numericValue > 2) System.out.println("Door (" + D.getId() + ") capacity is too big! (1 meter holds at most 2 persons)");
		else System.out.println("Door (" + D.getId() + ") has good capacity.");
	}
}
