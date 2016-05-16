package buildingInfo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "WINDOW")
@XmlAccessorType(XmlAccessType.FIELD)
public class Window {
	@XmlElement(name="widthw")
    private String width;

    @XmlElement(name="height")
    private String height;

    @XmlElement(name="windowX")
    private String windowX;
    
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

	public String getWindowX() {
		return windowX;
	}

	public void setWindowX(String windowX) {
		this.windowX = windowX;
	}

	public String getWindowY() {
		return windowY;
	}

	public void setWindowY(String windowY) {
		this.windowY = windowY;
	}

	public String getWallLabel() {
		return wallLabel;
	}

	public void setWallLabel(String wallLabel) {
		this.wallLabel = wallLabel;
	}

	public String getWindowID() {
		return windowID;
	}

	public void setWindowID(String windowID) {
		this.windowID = windowID;
	}

	@XmlElement(name="windowY")
    private String windowY;
    
    @XmlElement(name="wallLabel")
    private String wallLabel;

    @XmlElement(name="WindowID")
    private String windowID;
    
	@Override
	public String toString() {
		return "Window [windowID=" + windowID + ", width=" + width + ", height=" + height + ", windowX=" + windowX + ", windowY=" + windowY
				+ ", wallLabel=" + wallLabel + "]";
	}
    
}
