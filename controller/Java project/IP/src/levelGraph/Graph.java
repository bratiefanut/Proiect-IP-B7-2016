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
  private int exit;
  
  public static float distanceOfTwoPoints(String ax, String ay, String bx, String by)
        {
            float result;
            result = (float) Math.sqrt((Float.parseFloat(ax.trim()) - Float.parseFloat(bx.trim()))*(Float.parseFloat(ax.trim()) - Float.parseFloat(bx.trim())) + (Float.parseFloat(ay.trim()) - Float.parseFloat(by.trim()))*(Float.parseFloat(ay.trim()) - Float.parseFloat(by.trim())));
            return result/2f;
        }

  public Graph(List<Vertex> vertexes, List<Edge> edges) {
    vertexes = vertexes;
    edges = edges;
  }
  
  public Graph(Level level) //cream graful pe un anumit nivel din cladire
  {
        Room[] r = level.getRoom();
        int doorCount = 0;
        int edgeId = 0;
        int edgeCount = 0;
        vertexes.clear();
        edges.clear();
        for(Room roomie : r) // parcurgem camerele de pe nivel
        {
            Door[] d = roomie.getDoors();
            //System.out.println(roomie);
            for (Door door : d) // parcurgem usile
            {
                Vertex v = new Vertex(door.getId(), door.getdoorX(), door.getdoorY()); // cream varfurile folosind Id-ul usilor
                if(!vertexes.contains(v)){
                    vertexes.add(doorCount, v);
                    doorCount ++;   
                }
                if (door.getType().equals("EXTERNAL")) // salvam usa catre iesire (tipul ei nu este "INTERNAL"!
                {                                       // este external
                    exit = Integer.parseInt(door.getId());
                }
                if (Integer.parseInt(level.getLevelNumber()) >= 1 && roomie.getType().equals("STAIRSROOM"))
                {
                    exit = Integer.parseInt(door.getId());
                }
            }
            for(int i = 0; i<d.length-1; i++){
                for(int j = i + 1; j <d.length; j++){ // aici cream muchiile pentru graf ca fiind muchiile dintre usile care apartin aceleiasi camere
                    Vertex source = new Vertex(d[i].getId(), d[i].getdoorX(), d[i].getdoorY());
                    Vertex dest = new Vertex(d[j].getId(), d[j].getdoorX(), d[j].getdoorY());
                    float weight = distanceOfTwoPoints(source.getCoordX(),source.getCoordY(),dest.getCoordX(),dest.getCoordY());
                    Edge e = new Edge(Integer.toString(edgeId), source, dest, weight);
                    Edge f = new Edge(Integer.toString(edgeId), dest, source, weight);
                    edgeId = edgeId + 2;
                    edges.add(edgeCount, e);
                    edges.add(edgeCount, f);
                    edgeCount = edgeCount + 2;
                }
            }
            
        }
        
  }

  public List<Vertex> getVertexes() {
    return vertexes;
  }

  public List<Edge> getEdges() {
    return edges;
  }
  
  public int getExit()
  {
      return exit;
  }
}