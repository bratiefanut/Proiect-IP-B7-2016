package levelGraph;

import buildingInfo.Building;
import buildingInfo.Door;
import buildingInfo.Level;
import buildingInfo.Room;
import java.io.File;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class Main {

    private static Level level;
    private static Level nivel;
    private static List<Vertex> vertexes1 = new ArrayList<Vertex>();
    private static List<Edge> edges1 = new ArrayList<Edge>();
    static LinkedList<Vertex> path;
    static float pathWeight;
    
    static HashMap<Float, LinkedList<Vertex>> hmap = new HashMap<Float, LinkedList<Vertex>>();
    
    public static void Execute(Graph g, String varf) { // acest subprogram
        int end = 0;                                    // afiseaza drumul catre iesire incepand cu varful dat ca parametru
        int start = 0;
        DijkstraAlgorithm dijkstra = new DijkstraAlgorithm(g);
        for (int i = 0; i < vertexes1.size(); i++)
        {
            if (Integer.parseInt(vertexes1.get(i).getId()) == g.getExit())
                end = i;
            if(varf.equals(vertexes1.get(i).getId()))
                start = i;
        }
    
        dijkstra.execute(vertexes1.get(start));
        path = dijkstra.getPath(vertexes1.get(end));
        pathWeight = 0;
        for (int i = 0; i<path.size()-1;i++){ // aici calculam costul pentru fiecare drum 
            int j = i + 1;
            pathWeight += g.distanceOfTwoPoints(path.get(i).getCoordX(), path.get(i).getCoordY(), path.get(j).getCoordX(), path.get(j).getCoordY());
            
        }
//        for (Vertex vertex : path) {
//            System.out.print(vertex + " "); // aici afisam drumul
//        }
//        System.out.print(pathWeight); // aici afisam costul pentru fiecare drum
    }
     public static void main(String[] args) throws JAXBException
    {
        File file = new File("src\\parserXML\\Base.xml");
        JAXBContext jaxbContext = JAXBContext.newInstance(Building.class);

        Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
        Building building = (Building) jaxbUnmarshaller.unmarshal(file); //se parseaza XML-ul
        Level[] L = building.getLevels(); 
//        level = L[1]; // cream un graf pentru nivelul 0 (adica parter)
        for(Level level : L){
            Graph g = new Graph(level);
            vertexes1 = g.getVertexes();
            edges1 = g.getEdges();

//            System.out.println("Varfurile grafului sunt: ");
//            for (int i = 0; i < vertexes1.size(); i++)
//            {
//                System.out.println(vertexes1.get(i) + " si are coordonatele " + vertexes1.get(i).getCoordX() + ' ' + vertexes1.get(i).getCoordY());
//            }
//            System.out.println();
//            System.out.println("Muchiile grafului sunt: ");
//            for (int i = 0; i < edges1.size(); i++)
//            {
//                System.out.println(edges1.get(i) + " cu costul " + edges1.get(i).getWeight());
//            }
//            System.out.println();
            Room[] r = level.getRoom();
            for (Room room : r)
            {
                hmap.clear();
                Door[] d = room.getDoors();
                System.out.print(level.getLevelNumber() + " " + room.getLabel() + " ");

                for(int i = 0; i<d.length; i++){
                    if(d[i].getType().equals("EXTERNAL") || (room.getType().equals("STAIRSROOM") && Integer.parseInt(level.getLevelNumber()) >= 1)){
                        System.out.print(d[i].getId() + " " + 0);
                        hmap.clear();
                        continue;
                    }
                    if (!d[i].getId().equals(Integer.toString(g.getExit()))){
                        Execute(g,d[i].getId());
                    }
//                    for (Vertex vertex : path) {
//                        System.out.print(vertex + " "); // aici afisam drumul
//                    }
//                    System.out.print(pathWeight);
                    hmap.put(pathWeight, path);
                    //System.out.println();// aici afisam costul pentru fiecare drum

                }
                
                float minim = 999f;
                for (Map.Entry<Float, LinkedList<Vertex>> entry : hmap.entrySet()) {
                    if(minim > entry.getKey())
                        minim = entry.getKey();
                }
                for (Map.Entry<Float, LinkedList<Vertex>> entry : hmap.entrySet()) {
                    if(minim == entry.getKey()){
                        for(Vertex vertex : entry.getValue()){
                            System.out.print(vertex + " ");
                        }
                        System.out.print(entry.getKey()+" ");
                    }
                }
                System.out.println();
            }

            //System.out.println("Calea catre iesire este: ");
//            for(int i = 0; i < vertexes1.size(); i++)
//            {
//                if (!vertexes1.get(i).getId().equals(Integer.toString(g.getExit())))
//                {
//                    Execute(g,vertexes1.get(i).getId());
//                    System.out.println();
//                }
//            }
//            System.out.println( "Iesirea din graf este " + g.getExit());
//            System.out.println();
//            System.out.println();
//            System.out.println("--------------------------------------------");
            }
        }
}
