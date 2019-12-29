/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sw1_project;

import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author User all
 */
public class PostNGTest {
    
    public PostNGTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    /**
     * Test of setText method, of class Post.
     */
    @Test
    public void testSetText() {
        System.out.println("setText");
        String text = "";
        Post instance = new Post();
        instance.setText(text);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLikes method, of class Post.
     */
    @Test
    public void testSetLikes() {
        System.out.println("setLikes");
        int likes = 0;
        Post instance = new Post();
        instance.setLikes(likes);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setShares method, of class Post.
     */
    @Test
    public void testSetShares() {
        System.out.println("setShares");
        int shares = 0;
        Post instance = new Post();
        instance.setShares(shares);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getText method, of class Post.
     */
    @Test
    public void testGetText() {
        System.out.println("getText");
        Post instance = new Post();
        String expResult = "";
        String result = instance.getText();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLikes method, of class Post.
     */
    @Test
    public void testGetLikes() {
        System.out.println("getLikes");
        Post instance = new Post();
        int expResult = 0;
        int result = instance.getLikes();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getShares method, of class Post.
     */
    @Test
    public void testGetShares() {
        System.out.println("getShares");
        Post instance = new Post();
        int expResult = 0;
        int result = instance.getShares();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
