package buildingInfo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="WALL")
@XmlAccessorType(XmlAccessType.FIELD)
public class Wall {
	
	@XmlElement(name="wallLabel")
	private String wallLabel;
	
	@XmlElement(name="widthp")
	private String width;
	
	@XmlElement(name="height")
	private String height;

	public String getWidth() {
		return width;
	}

	public void setWidth(String width) {
		this.width = width;
	}

	public String getHeight() {
		return height;
	}

	public void setHeight(String height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return "Wall [width=" + width + ", height=" + height + "wall label: "+ wallLabel +"]";
	}
	
}
