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
public class RedBlackTreeITest {
    
    public RedBlackTreeITest() {
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
     * Test of put method, of class RedBlackTree.
     */
    @Test
    public void testPut() {
        System.out.println("put");
        Object key = null;
        Object value = null;
        RedBlackTree instance = new RedBlackTree();
        instance.put((Comparable) key, value);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get method, of class RedBlackTree.
     */
    @Test
    public void testGet() {
        System.out.println("get");
        Object key = null;
        RedBlackTree instance = new RedBlackTree();
        Object expResult = null;
        Object result = instance.get((Comparable) key);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isEmpty method, of class RedBlackTree.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        RedBlackTree instance = new RedBlackTree();
        boolean expResult = false;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
