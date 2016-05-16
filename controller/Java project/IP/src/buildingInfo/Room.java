package buildingInfo;

import java.util.Arrays;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;


@XmlRootElement(name="ROOM")
@XmlSeeAlso({Door.class, Window.class, Corner.class, Wall.class })
@XmlAccessorType(XmlAccessType.FIELD)
public class Room {

    @XmlElement(name="LABEL")
    private String label;

    @XmlElement(name="TYPE")
    private String type;    

    @XmlElement(name="HEIGHT")
    private String height;

    @XmlElement(name="WIDTH")
    private String width;

    @XmlElement(name="LENGTH")
    private String length;

    @XmlElement(name="CAPACITY")
    private String capacity;

    @XmlElement(name="SPRINKLER")
    private String sprinkler;

    @XmlElement(name="SMOKEDETECTOR")
    private String smokeDet;

    @XmlElement(name="EXTINGUISHERNUMBER")
    private String extNum;

    @XmlElement(name="wallNumbers")
    private String wallNumber;
    
    @XmlElement(name="WALL")
    public Wall walls[];
    
    @XmlElement(name="EXTINGUISHER")
    public Extinguish ext[];
 

    @XmlElement(name="CORNER")
    public Corner corners[];
    
    @XmlElement(name="DOOR")
    public Door doors[];
  
    @XmlElement(name="DOORNUMBER")
    private String doorNumber;


    @XmlElement(name="WindowsNumber")
    private String windowNumber;


    @XmlElement(name="WINDOW")
    public Window windows[];   
    
    public String getLabel() {
        return label;
    }
    public void setLabel(String label) {
        this.label = label;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    
    public String getHeight() {
        return height;
    }
    public void setHeight(String height) {
        this.height = height;
    }
    public String getWidth() {
        return width;
    }
    public void setWidth(String width) {
        this.width = width;
    }
    public String getLength() {
        return length;
    }
    public void setLength(String length) {
        this.length = length;
    }
    public String getCapacity() {
        return capacity;
    }
    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }
    public String getSprinkler() {
        return sprinkler;
    }
    public void setSprinkler(String sprinkler) {
        this.sprinkler = sprinkler;
    }
    public String getSmokeDet() {
        return smokeDet;
    }
    public void setSmokeDet(String smokeDet) {
        this.smokeDet = smokeDet;
    }
    public String getExtNum() {
        return extNum;
    }
    public void setExtNum(String extNum) {
        this.extNum = extNum;
    }
   
    
    public String getWallNumber() {
		return wallNumber;
	}
	public void setWallNumber(String wallNumber) {
		this.wallNumber = wallNumber;
	}
	
	public Wall[] getWallLabels() {
		return walls;
	}
	

	public Corner[] getCorners() {
		return corners;
	}
	public void setCorners(Corner[] Corners) {
		this.corners = Corners;
	}
	
	public String getDoorNumber() {
		return doorNumber;
	}
	public void setDoorNumber(String doorNumber) {
		this.doorNumber = doorNumber;
	}
	public Door[] getDoors() {
		return doors;
	}
	public void setDoors(Door[] doors) {
		this.doors = doors;
	}
	public String getWindowNumber() {
		return windowNumber;
	}
	public void setWindowNumber(String windowNumber) {
		this.windowNumber = windowNumber;
	}
	public Window[] getWindows() {
		return windows;
	}
	public void setWindows(Window[] windows) {
		this.windows = windows;
	}
	

    @Override
	public String toString() {
		return "Room [label=" + label + ", type=" + type + ", height=" + height + ", width=" + width + ", length="
				+ length + ", capacity=" + capacity + ", sprinkler=" + sprinkler + ", smokeDet=" + smokeDet
				+ ", extNum=" + extNum + Arrays.toString(ext) + ", wallNumber=" + wallNumber + ", walls=" + Arrays.toString(walls)
				+ ", corners=" + Arrays.toString(corners) + ", doors="
				+ Arrays.toString(doors) + ", doorNumber=" + doorNumber + ", windowNumber=" + windowNumber
				+ ", windows=" + Arrays.toString(windows) + "EXTINGUISHER: " +" ]";
	}    

}
