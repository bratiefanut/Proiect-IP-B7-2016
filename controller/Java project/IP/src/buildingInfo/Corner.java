package buildingInfo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;

@XmlRootElement(name = "CORNER")
@XmlSeeAlso({Wall.class})
@XmlAccessorType(XmlAccessType.FIELD)

public class Corner {

    @XmlElement(name="cornerX")
    private String cornerX;
    
    @XmlElement(name="cornerY")
    private String cornerY;
    

    @XmlElement(name="wallLabels")
    public String wallLabel;


	public String getCornerX() {
		return cornerX;
	}


	public void setCornerX(String cornerX) {
		this.cornerX = cornerX;
	}


	public String getCornerY() {
		return cornerY;
	}


	public void setCornerY(String cornerY) {
		this.cornerY = cornerY;
	}


	public String getWallLabel() {
		return wallLabel;
	}

    
	@Override
	public String toString() {
		return "[ CORNER: x= "+ cornerX + " y= " + cornerY + "containing walls: " + wallLabel + " ] ";
	}
    
    
    
}
