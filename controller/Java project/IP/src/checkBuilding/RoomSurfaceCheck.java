package checkBuilding;
import buildingInfo.*;

public class RoomSurfaceCheck {
	
	public static void verifySurface(Level[] L) {
		double totalSurface = 0.0;
		for (Level levels : L) {
			double w = Double.parseDouble(levels.getWidth());
			double l = Double.parseDouble(levels.getLength());
			totalSurface = w * l;
			Room[] R = levels.getRoom();
			for (Room rooms : R) {
				w = Double.parseDouble(rooms.getWidth());
				l = Double.parseDouble(rooms.getLength());
				totalSurface -= w*l;
			}
			if (totalSurface != 0)
				System.out.println("Measures on this level are wrong! " + levels.getLevelNumber());
			else System.out.println("Measures are good on this level! "+ levels.getLevelNumber());
		}
	}
}
