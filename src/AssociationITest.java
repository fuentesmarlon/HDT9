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
public class AssociationITest {
    
    public AssociationITest() {
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
     * Test of equals method, of class Association.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object other = null;
        Association instance = null;
        boolean expResult = false;
        boolean result = instance.equals(other);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class Association.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Association instance = null;
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getValue method, of class Association.
     */
    @Test
    public void testGetValue() {
        System.out.println("getValue");
        Association instance = null;
        Object expResult = null;
        Object result = instance.getValue();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getKey method, of class Association.
     */
    @Test
    public void testGetKey() {
        System.out.println("getKey");
        Association instance = null;
        Object expResult = null;
        Object result = instance.getKey();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setValue method, of class Association.
     */
    @Test
    public void testSetValue() {
        System.out.println("setValue");
        Object value = null;
        Association instance = null;
        Object expResult = null;
        Object result = instance.setValue(value);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Association.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Association instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
