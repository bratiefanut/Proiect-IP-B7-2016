package parserXML;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import buildingInfo.Building;
import buildingInfo.Level;

public class JAXBParser {

    public static void arsing() throws JAXBException{
        File file = new File("src\\parserXML\\Base.xml");
        JAXBContext jaxbContext = JAXBContext.newInstance(Building.class);

        Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
        Building building = (Building) jaxbUnmarshaller.unmarshal(file);
        System.out.println(building);
    }
}
