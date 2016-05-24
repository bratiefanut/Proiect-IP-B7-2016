/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package levelGraph;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author catal
 */
public class GraphTest {
    
    public GraphTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of distanceOfTwoPoints method, of class Graph.
     */
    @Test
    public void testDistanceOfTwoPoints() {
        
        System.out.println("distanceOfTwoPoints");
        String ax = "-2";
        String ay = "-3";
        String bx = "-4";
        String by = "4";
        float result = Graph.distanceOfTwoPoints(ax, ay, bx, by);
        assertEquals(3.64, result, 0.01);
        ax = "5";
        ay = "6";
        bx = "7";
        by = "9";
        result = Graph.distanceOfTwoPoints(ax, ay, bx, by);
        //float expResult = 0.0F;
        assertEquals(3.6, result, 0.0);
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getVertexes method, of class Graph.
     */
    @Test
    public void testGetVertexes() {
        System.out.println("getVertexes");
        
        List<Vertex> vertexes = new ArrayList<>();
            vertexes.add( new Vertex("1","2","3") );//0
            vertexes.add( new Vertex("1qq","2","3")); //1
            vertexes.add( new Vertex("2","10","8"));//2
            vertexes.add( new Vertex("3","11","12"));//3
            vertexes.add( new Vertex("4","5","3"));//4
            vertexes.add( new Vertex("-5","5","3"));//5
            
        List<Edge> edges = new ArrayList<>();
        edges.add(new Edge("1", vertexes.get(0), vertexes.get(1), 3.14f));
        edges.add(new Edge("2", vertexes.get(0), vertexes.get(3), 2.2f));
        
       
        Graph g = new Graph(vertexes, edges);
       
        List<Vertex> result;
        result = g.getVertexes();
        assertEquals(vertexes, result);
        
    }

    /**
     * Test of getEdges method, of class Graph.
     */
    @Test
    public void testGetEdges() {
        System.out.println("getEdges");
       List<Vertex> vertexes = new ArrayList<>();
            vertexes.add( new Vertex("1","2","3") );//0
            vertexes.add( new Vertex("1qq","2","3")); //1
            vertexes.add( new Vertex("2","10","8"));//2
            vertexes.add( new Vertex("3","11","12"));//3
            vertexes.add( new Vertex("4","5","3"));//4
            vertexes.add( new Vertex("-5","5","3"));//5
            
        List<Edge> edges = new ArrayList<>();
        edges.add(new Edge("1", vertexes.get(0), vertexes.get(1), 3.14f));
        edges.add(new Edge("2", vertexes.get(0), vertexes.get(3), 2.2f));
        edges.add(new Edge("3", vertexes.get(1), vertexes.get(3), 3.2f));
        edges.add(new Edge("4", vertexes.get(2), vertexes.get(3), 4.2f));
        edges.add(new Edge("5", vertexes.get(2), vertexes.get(4), 4.1f));
        edges.add(new Edge("6", vertexes.get(3), vertexes.get(4), 5.21f));
        edges.add(new Edge("7", vertexes.get(4), vertexes.get(5), 5.22f));
       
        Graph g = new Graph(vertexes, edges);
        
        
        List<Edge> expResult = new ArrayList<>();
        expResult.add(new Edge("1", vertexes.get(0), vertexes.get(1), 3.14f));
        expResult.add(new Edge("2", vertexes.get(0), vertexes.get(3), 2.2f));
        expResult.add(new Edge("3", vertexes.get(1), vertexes.get(3), 3.2f));
        expResult.add(new Edge("4", vertexes.get(2), vertexes.get(3), 4.2f));
        expResult.add(new Edge("5", vertexes.get(2), vertexes.get(4), 4.1f));
        expResult.add(new Edge("6", vertexes.get(3), vertexes.get(4), 5.21f));
        expResult.add(new Edge("7", vertexes.get(4), vertexes.get(5), 5.22f));
        
        //
        assertEquals(expResult, g.GetEdges());
        
    }

    /**
     * Test of getExit method, of class Graph.
     */
    @Test
    public void testGetExit() {
        System.out.println("getExit");
        List<Vertex> vertexes = new ArrayList<>();
                
            vertexes.add( new Vertex("1","2","3") );//0
            vertexes.add( new Vertex("1qq","2","3")); //1
            vertexes.add( new Vertex("2","10","8"));//2
            vertexes.add( new Vertex("3","11","12"));//3
            vertexes.add( new Vertex("4","5","3"));//4
            vertexes.add( new Vertex("-5","5","3"));//5
            
        List<Edge> edges = new ArrayList<>();
        edges.add(new Edge("1", vertexes.get(0), vertexes.get(1), 3.14f));
        edges.add(new Edge("2", vertexes.get(0), vertexes.get(3), 2.2f));
        edges.add(new Edge("3", vertexes.get(1), vertexes.get(3), 3.2f));
        edges.add(new Edge("4", vertexes.get(2), vertexes.get(3), 4.2f));
        edges.add(new Edge("5", vertexes.get(2), vertexes.get(4), 4.1f));
        edges.add(new Edge("6", vertexes.get(3), vertexes.get(4), 5.21f));
        edges.add(new Edge("7", vertexes.get(4), vertexes.get(5), 5.22f));
        
        
        Graph g = new Graph(vertexes, edges);
        int expResult = 0;
        int result = g.getExit();
        assertEquals(expResult, result);
    
    }
   
    
}
