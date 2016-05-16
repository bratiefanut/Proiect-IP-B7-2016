package checkBuilding;
import buildingInfo.*;

public class InterferenceBetweenDoorAndWindow {
	public void verifyDoorAndWindow (Room[] R) {
		Boolean isOverlapped = false;
		for (Room rooms : R) {
			Door[] D = rooms.getDoors();
			for (Door doors : D) {
				Double doorX = Double.parseDouble(doors.getdoorX());
				Double doorY = Double.parseDouble(doors.getdoorY());
				String doorID = doors.getId();
				for (Room r : R) {
					Window[] W = r.getWindows();
					for (Window windows : W) {
						Double windowX = Double.parseDouble(windows.getWindowX());
						Double windowY = Double.parseDouble(windows.getWindowY());
						String windowID = windows.getWindowID();
						if (doorX == windowX && doorY == windowY) {
							System.out.println("Door ("+doorID+") and window ("+windowID+") are overlapping!" );
							isOverlapped = true;
						}
					}
				}
			}
		}
		if (isOverlapped == false) System.out.println("All doors and windows are fine on this level!");
	}
}
