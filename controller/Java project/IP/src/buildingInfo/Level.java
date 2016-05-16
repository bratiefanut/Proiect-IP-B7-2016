package buildingInfo;

import java.util.Arrays;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;


@XmlRootElement(name="LEVEL")
@XmlSeeAlso({Room.class})
@XmlAccessorType(XmlAccessType.FIELD)
public class Level {

    @XmlElement(name="LevelNumber")
    private String levelNumber;

    @XmlElement(name="HEIGHT")
    private String height;
    
    @XmlElement(name="WIDTH")
    private String width;
    
    @XmlElement(name="LENGTH")
    private String length;
    
    @XmlElement(name="ROOMNUMBER")
    private String roomNumber;

    @XmlElement(name="ROOM")
    public Room rooms[];
    
    
	public String getLevelNumber() {
		return levelNumber;
	}

	public void setLevelNumber(String levelNumber) {
		this.levelNumber = levelNumber;
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

	public String getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(String roomNumber) {
		this.roomNumber = roomNumber;
	}

	public Room[] getRoom() {
        return rooms;
    }

    public void setRoom(Room[] room) {
        this.rooms = room;
    }

	@Override
	public String toString() {
		return "Level [levelNumber=" + levelNumber + ", height=" + height + ", width=" + width + ", length=" + length
				+ ", roomNumber=" + roomNumber + ", rooms=" + Arrays.toString(rooms) + "]";
	}

   
}
