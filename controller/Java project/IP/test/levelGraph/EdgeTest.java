/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package levelGraph;

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
public class EdgeTest {
    
    public EdgeTest() {
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
     * Test of getId method, of class Edge.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Vertex v1 = new Vertex("1","2","3");
        Vertex v2 = new Vertex("2","5","3");
        Edge instance = new Edge("1",v1,v2, 3.14f);
        
        String expResult = "1";
        String result = instance.getId();
        //System.out.println(result);
        assertEquals(expResult, result);
  
    }

    /**
     * Test of getDestination method, of class Edge.
     */
    @Test
    public void testGetDestination() {
        System.out.println("getDestination");
        Edge instance1 = new Edge("1",new Vertex("1","2","3"), new Vertex("2","5","3"), 3.14f);
        Edge instance2 = new Edge("2",new Vertex("5","11","12"), new Vertex("5","11","12"), 3.14f);
        
        Vertex expResult1 = new Vertex("2","5","3");
        Vertex expResult2 = new Vertex("5","11","12");
        Vertex result1 = instance1.getDestination();
        Vertex result2 = instance2.getDestination();
        assertEquals(expResult1, result1);
      assertEquals(expResult2, result2);
    }

    /**
     * Test of getSource method, of class Edge.
     */
    @Test
    public void testGetSource() {
        System.out.println("getSource");
        Edge instance1 = new Edge("1",new Vertex("1","2","3"), new Vertex("2","5","3"), 3.14f);
        Edge instance2 = new Edge("2",new Vertex("5","11","12"), new Vertex("5","11","12"), 3.14f);
        
        Vertex expResult1 = new Vertex("1","2","3");
        Vertex expResult2 = new Vertex("5","11","12");
        Vertex result1 = instance1.getDestination();
        Vertex result2 = instance2.getDestination();
        assertEquals(expResult1, result1);
        assertEquals(expResult2, result2);
    }

    /**
     * Test of getWeight method, of class Edge.
     */
    @Test
    public void testGetWeight() {
        System.out.println("getWeight");
        Edge instance = new Edge("1",new Vertex("1","2","3"), new Vertex("2","5","3"), 3.14f);
        
        float expResult = 0.0F;
        float result = instance.getWeight();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Edge.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Vertex v1 = new Vertex("1","2","3");
        Vertex v2 = new Vertex("2","5","3");
        Edge instance = new Edge("1",v1,v2, 3.14f);
        
        String expResult = instance.getSource() + " " + instance.getDestination() ;
        String result = instance.toString();
        assertEquals(expResult, result);
    }
    
}
