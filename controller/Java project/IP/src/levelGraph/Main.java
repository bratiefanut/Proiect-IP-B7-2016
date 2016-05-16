package levelGraph;

import buildingInfo.Building;
import buildingInfo.Door;
import buildingInfo.Level;
import buildingInfo.Room;
import java.io.File;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class Main {
    
    public static void testExecute(Graph g, int start, int end) {
    DijkstraAlgorithm dijkstra = new DijkstraAlgorithm(g);
    dijkstra.execute(vertexes.get(start));
    LinkedList<Vertex> path = dijkstra.getPath(vertexes.get(end));

    for (Vertex vertex : path) {
      System.out.println(vertex);
    }
    }
  private static List<Vertex> vertexes = new ArrayList<Vertex>();
  private static List<Edge> edges = new ArrayList<Edge>();
    static float distanceOfTwoPoints(String ax, String ay, String bx, String by)
        {
            float result;
            result = (float) Math.sqrt((Float.parseFloat(ax.trim()) - Float.parseFloat(bx.trim()))*(Float.parseFloat(ax.trim()) - Float.parseFloat(bx.trim())) + (Float.parseFloat(ay.trim()) - Float.parseFloat(by.trim()))*(Float.parseFloat(ay.trim()) - Float.parseFloat(by.trim())));
            return result;
        }
     public static void main(String[] args) throws JAXBException
    {
        File file = new File("src\\parserXML\\Base.xml");
        JAXBContext jaxbContext = JAXBContext.newInstance(Building.class);

        Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
        Building building = (Building) jaxbUnmarshaller.unmarshal(file);
        //System.out.println(building);
        //System.out.println();
        Level[] L = building.getLevels();
        Room[] r = L[0].getRoom();
        
        int doorCount = 0;
        int edgeId = 0;
        int edgeCount = 0;
        vertexes.clear();
        edges.clear();
        for(Room roomie : r)
        {
            Door[] d = roomie.getDoors();
            //System.out.println(roomie);
            for (Door door : d)
            {
                Vertex v = new Vertex(door.getId(), door.getdoorX(), door.getdoorY());
                if(!vertexes.contains(v)){
                    vertexes.add(doorCount, v);
                    doorCount ++;   
                }
            }
            for(int i = 0; i<d.length-1; i++){
                for(int j = i + 1; j <d.length; j++){
                    Vertex source = new Vertex(d[i].getId(), d[i].getdoorX(), d[i].getdoorY());
                    Vertex dest = new Vertex(d[j].getId(), d[j].getdoorX(), d[j].getdoorY());
                    float weight = distanceOfTwoPoints(source.getCoordX(),source.getCoordY(),dest.getCoordX(),dest.getCoordY());
                    Edge e = new Edge(Integer.toString(edgeId), source, dest, weight);
                    edgeId++;
                    edges.add(edgeCount, e);
                    edgeCount ++;
                }
            }
        }

        for(int i=0; i<vertexes.size(); i++){
            System.out.print("V: " + vertexes.get(i).getId() +' ' + vertexes.get(i).getCoordX() + ' ' + vertexes.get(i).getCoordY());
            System.out.println();
        }
        System.out.println();
        for(int i=0; i<edges.size(); i++){
            System.out.print("E: " + edges.get(i).getId() +' ' + edges.get(i).getSource().getId() + ' ' + edges.get(i).getDestination().getId() + " cu costul " + edges.get(i).getWeight());
            System.out.println();
        }
        Graph g = new Graph(vertexes, edges);
        g.setEdges(edges);
        g.setVertexes(vertexes);
        testExecute(g,3,6);
    }
}
