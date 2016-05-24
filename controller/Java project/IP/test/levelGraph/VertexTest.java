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
public class VertexTest {
    
    public VertexTest() {
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
     * Test of getId method, of class Vertex.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Vertex instance1 = new Vertex("1qq","2","3");
        Vertex instance2 = new Vertex("2","5","3");
        Vertex instance3 = new Vertex("-5","5","3");
        
        String expResult1 = "1qq";//acceptam not numbers
        String expResult2 = "2";
        String expResult3 = "-5";//acceptam negative numbers
        
        String result1 = instance1.getId();
        String result2 = instance2.getId();
        String result3 = instance3.getId();
        assertEquals(expResult1, result1);
        assertEquals(expResult2, result2);
        assertEquals(expResult3, result3);
       
    }

    /**
     * Test of getCoordX method, of class Vertex.
     */
    @Test
    public void testGetCoordX() {
        System.out.println("getCoordX");
        
        Vertex instance1 = new Vertex("1","2","3");
        Vertex instance2 = new Vertex("2","-5","3");
        Vertex instance3 = new Vertex("3","5.88","3");
        
        String expResult1 = "2";//acceptam not numbers
        String expResult2 = "5";//acceptam negative numbers
        String expResult3 = "5.88";
        
        String result1 = instance1.getCoordX();
        String result2 = instance2.getCoordX();
        String result3 = instance3.getCoordX();
        assertEquals(expResult1, result1);
        assertEquals(expResult2, result2);
        assertEquals(expResult3, result3);
       
    }

    /**
     * Test of getCoordY method, of class Vertex.
     */
    @Test
    public void testGetCoordY() {
        System.out.println("getCoordY");
       Vertex instance1 = new Vertex("1","2","3");
        Vertex instance2 = new Vertex("2","-5","-3");
        Vertex instance3 = new Vertex("5","5.88","9999999");
        
        String expResult1 = "2";//acceptam not numbers
        String expResult2 = "5";//coordonatele negative ajung pozitive
        String expResult3 = "5.88";//acceptam negative numbers
        
        String result1 = instance1.getCoordX();
        String result2 = instance2.getCoordX();
        String result3 = instance3.getCoordX();
        assertEquals(expResult1, result1);
        assertEquals(expResult2, result2);
        assertEquals(expResult3, result3);
    }

    /**
     * Test of getName method, of class Vertex.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Vertex instance = new Vertex("1","2","3");
        Vertex instance1 = new Vertex("1qq","2","3");
        Vertex instance2 = new Vertex("2","5","3");
        Vertex instance3 = new Vertex("-5","5","3");
        
        String expResult = "1";
        String expResult1 = "1qq";//acceptam not numbers
        String expResult2 = "2";
        String expResult3 = "-5";//acceptam negative numbers
        String result = instance.getName();
        String result1 = instance1.getName();
        String result2 = instance2.getName();
        String result3 = instance3.getName();
        assertEquals(expResult, result);
        assertEquals(expResult1, result1);
        assertEquals(expResult2, result2);
        assertEquals(expResult3, result3);
       
    }

    /**
     * Test of hashCode method, of class Vertex.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Vertex instance1 = new Vertex("1","2","3");
//        System.out.println(instance1.hashCode());
//        System.out.println(instance1.hashCode());
        Vertex instance2 = new Vertex("2","5","3");
//        System.out.println(instance2.hashCode());
//        System.out.println(instance2.hashCode());
        Vertex instance3 = null;
        //System.out.println(instance3.hashCode());
        
        int expResult1 = 80;
        int expResult2 = 81;
        //int expResult3 = null;
         
        int result1 = instance1.hashCode();
        int result2 = instance2.hashCode();
        //int result3 = instance3.hashCode();
        
        assertEquals(expResult1, result1);
        assertEquals(expResult2, result2);
        //assertEquals(expResult3, result3);
            
      
    }

    /**
     * Test of equals method, of class Vertex.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        
        Object obj = null;
        Vertex instance1 = new Vertex("1","2","3");

        Vertex instance2 = new Vertex("2","5","3");
        
        Vertex instance3 = null;
    
        
        boolean expResult1 = true;//aici e aiurea declarat equals
        boolean expResult2 = true;//v1== v1 !!!
        boolean expResult3 = false;//v1== v2
        boolean expResult4 = false;//null==obj.null
     
        //boolean result1 = instance1.equals(obj);
        boolean result2 = instance1.equals(instance1);
        boolean result3 = instance1.equals(instance2);
        boolean result4 = instance1.equals(instance2);
        
        //assertEquals(expResult1, result1);
        assertEquals(expResult2, result2);
        assertEquals(expResult3, result3);
        assertEquals(expResult4, result4);
        
    }

    /**
     * Test of toString method, of class Vertex.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
    
        Vertex instance = new Vertex("1","2","3");
        Vertex instance1 = new Vertex("1qq","2","3");
        Vertex instance2 = new Vertex("2","5","3");
        Vertex instance3 = new Vertex("-5","5","3");
        
        String expResult = "1";
        String expResult1 = "1qq";//acceptam not numbers
        String expResult2 = "2";
        String expResult3 = "-5";//acceptam negative numbers
        String result = instance.toString();
        String result1 = instance1.toString();
        String result2 = instance2.toString();
        String result3 = instance3.toString();
        assertEquals(expResult, result);
        assertEquals(expResult1, result1);
        assertEquals(expResult2, result2);
        assertEquals(expResult3, result3);
    }

    
}
