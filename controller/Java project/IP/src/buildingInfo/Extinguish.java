package buildingInfo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "EXTINGUISHER")
@XmlAccessorType(XmlAccessType.FIELD)


public class Extinguish {
	
	@XmlElement(name="extinguisherID")
	private String extID;

	@XmlElement(name="extinguisherX")
	private String extX;

	@XmlElement(name="extinguisherY")
	private String extY;


	@Override
	public String toString() {
		return "Extinguisher [extinguisherID=" + extID + " , X= " + extX + " , Y= " + extY + "] "; 
	}

}
