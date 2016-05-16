package buildingInfo;

import java.util.Arrays;
//import java.util.logging.Level;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;

@XmlRootElement(name = "BUILDING")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlSeeAlso({ Level.class })
public class Building {

	@XmlElement(name = "HEIGHT")
	private String height;
	
	@XmlElement(name = "WIDTH")
	private String width;
	
	@XmlElement(name = "LENGTH")
	private String length;
	
	
	@XmlElement(name = "LEVEL")
    public Level levels[];
    
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

    public Level[] getLevels() {
        return levels;
    }

    public void setLevels(Level[] levels) {
        this.levels = levels;
    }

	@Override
	public String toString() {
		return "Building [height=" + height + ", width=" + width + ", length=" + length + ", levels="
				+ Arrays.toString(levels) + "]";
	}
   

}
