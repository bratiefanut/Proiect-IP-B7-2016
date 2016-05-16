package buildingInfo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "DOOR")
@XmlAccessorType(XmlAccessType.FIELD)
public class Door {

    @XmlElement(name="ID")
    private String id;

    @XmlElement(name="TYPE")
    private String type;

    @XmlElement(name="CAPACITY")
    private String capacity;
    
    @XmlElement(name="isHermetic")
    private String isHermetic;
    
    @XmlElement(name="widthd")
    private String width;
    
    @XmlElement(name="height")
    private String height;
    
    @XmlElement(name="doorX")
    private String doorX;
    
    @XmlElement(name="doorY")
    private String doorY;
    
    @XmlElement(name="wallLabel")
    private String wallLabel;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }
    
    public String getisHermetic(){
    	return isHermetic;
    }
    
    public void setisHermetic(String isHermetic){
    	this.isHermetic=isHermetic;
    }
    
    public String getWidth(){
    	return width;
    }
    
    public void setwidth(String width){
    	this.width=width;
    }
    
    public String getheight(){
    	return height;
    }
    
    public void setheight(String height){
    	this.height=height;
    }
    
    public String getdoorX(){
    	return doorX;
    }
    
    public void setdoorX(String doorX){
    	this.doorX=doorX;
    }
    
    public String getdoorY(){
    	return doorY;
    }
    
    public void setdoorY(String doorY){
    	this.doorY=doorY;
    }
    
    public String getwallLabel(){
    	return wallLabel;
    }
    
    public void setwallLabel(String wallLabel){
    	this.wallLabel=wallLabel;
    }


    @Override
    public String toString() {
        return "Door [id=" + id + ", type=" + type + ", capacity=" + capacity
                + ", isHermetic=" + isHermetic + ", width=" +width + ", height=" + height 
                + ", doorX=" + doorX + ", doorY" + doorY + ", wallLabel=" + wallLabel + "]";
    }
}