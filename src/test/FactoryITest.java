/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Marlon
 */
public class FactoryITest {
    
    public FactoryITest() {
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
     * Test of getInstancia method, of class Factory.
     */
    @Test
    public void testGetInstancia() {
        System.out.println("getInstancia");
        Factory expResult = null;
        Factory result = Factory.getInstancia();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getImplementacion method, of class Factory.
     */
    @Test
    public void testGetImplementacion() {
        System.out.println("getImplementacion");
        String imp = "";
        MapComparable expResult = null;
        MapComparable result = Factory.getImplementacion(imp);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
