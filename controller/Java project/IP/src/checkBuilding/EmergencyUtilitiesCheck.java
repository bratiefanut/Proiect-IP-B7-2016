package checkBuilding;
import buildingInfo.*;

public class EmergencyUtilitiesCheck {
	
	public void checkExtinguisher (Room[] R) {
		for (Room rooms : R) {
			Integer eq = Integer.parseInt(rooms.getExtNum());
			if (eq == 0) System.out.println("Room +("+rooms.getLabel()+") does not have an extinguisher!");
			else System.out.println("Room +("+rooms.getLabel()+") has an extinguisher!");
		}
	}
	
	public void checkSprinkler (Room[] R) {
		for (Room rooms : R) {
			String eq = rooms.getSprinkler();
			if (eq.equalsIgnoreCase("NO")) System.out.println("Room +("+rooms.getLabel()+") does not have a sprinkler!");
			else System.out.println("Room +("+rooms.getLabel()+") has a sprinkler!");
		}
	}
	
	public void checkSmokeDetector (Room[] R) {
		for (Room rooms : R) {
			String eq = rooms.getSmokeDet();
			if (eq.equalsIgnoreCase("NO")) System.out.println("Room +("+rooms.getLabel()+") does not have a smoke detector!");
			else System.out.println("Room +("+rooms.getLabel()+") has a smoke detector!");
		}
	}
	
	public void checkIfHasDoor (Room[] R) {
		for (Room rooms : R) {
			Integer eq = Integer.parseInt(rooms.getDoorNumber());
			if (eq < 1) System.out.println("Room +("+rooms.getLabel()+") does not have a door!");
			else System.out.println("Room +("+rooms.getLabel()+") has a door!");
		}
	}

}
