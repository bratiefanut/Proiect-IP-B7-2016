package levelGraph;
import buildingInfo.Building;
import buildingInfo.Level;
import buildingInfo.Room;
import buildingInfo.Corner;
import buildingInfo.Door;
import buildingInfo.Extinguish;
import buildingInfo.Level;
import buildingInfo.Wall;
import buildingInfo.Window;

import levelGraph.Vertex;
import levelGraph.Edge;

import java.util.List;
import java.io.File;
import java.util.ArrayList;
import java.util.LinkedList;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import parserXML.JAXBParser;
import static parserXML.JAXBParser.arsing;

public class Graph{
    
  private static List<Vertex> vertexes = new ArrayList<Vertex>();
  private static List<Edge> edges = new ArrayList<Edge>();

  public Graph(List<Vertex> vertexes, List<Edge> edges) {
    vertexes = vertexes;
    edges = edges;
  }


  public List<Vertex> getVertexes() {
    return vertexes;
  }
  public void setVertexes(List<Vertex> v){
      vertexes = v;
  }

  public List<Edge> getEdges() {
    return edges;
  }
  public void setEdges(List<Edge> e){
      edges = e;
  }
}