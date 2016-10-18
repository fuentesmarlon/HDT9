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
public class HashAssociationITest {
    
    public HashAssociationITest() {
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
     * Test of getValue method, of class HashAssociation.
     */
    @Test
    public void testGetValue() {
        System.out.println("getValue");
        HashAssociation instance = null;
        Object expResult = null;
        Object result = instance.getValue();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getKey method, of class HashAssociation.
     */
    @Test
    public void testGetKey() {
        System.out.println("getKey");
        HashAssociation instance = null;
        Object expResult = null;
        Object result = instance.getKey();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setValue method, of class HashAssociation.
     */
    @Test
    public void testSetValue() {
        System.out.println("setValue");
        Object value = null;
        HashAssociation instance = null;
        Object expResult = null;
        Object result = instance.setValue(value);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of reserved method, of class HashAssociation.
     */
    @Test
    public void testReserved() {
        System.out.println("reserved");
        HashAssociation instance = null;
        boolean expResult = false;
        boolean result = instance.reserved();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of reserve method, of class HashAssociation.
     */
    @Test
    public void testReserve() {
        System.out.println("reserve");
        HashAssociation instance = null;
        instance.reserve();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class HashAssociation.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        HashAssociation instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
