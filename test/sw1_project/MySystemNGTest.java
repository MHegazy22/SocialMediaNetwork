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
public class MySystemNGTest {
    
    public MySystemNGTest() {
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
     * Test of register method, of class MySystem.
     */
    @Test
    public void testRegister() {
        System.out.println("register");
        MySystem instance = new MySystem();
        instance.register();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of login method, of class MySystem.
     */
    @Test
    public void testLogin() {
        System.out.println("login");
        MySystem instance = new MySystem();
        Boolean expResult = null;
        Boolean result = instance.login();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of searchUser method, of class MySystem.
     */
    @Test
    public void testSearchUser() {
        System.out.println("searchUser");
        String name = "";
        MySystem instance = new MySystem();
        User expResult = null;
        User result = instance.searchUser(name);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delteUser method, of class MySystem.
     */
    @Test
    public void testDelteUser() {
        System.out.println("delteUser");
        String name = "";
        MySystem instance = new MySystem();
        instance.delteUser(name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of upgrade method, of class MySystem.
     */
    @Test
    public void testUpgrade() {
        System.out.println("upgrade");
        MySystem instance = new MySystem();
        instance.upgrade();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of procces method, of class MySystem.
     */
    @Test
    public void testProcces() {
        System.out.println("procces");
        MySystem instance = new MySystem();
        instance.procces();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of run method, of class MySystem.
     */
    @Test
    public void testRun() {
        System.out.println("run");
        MySystem instance = new MySystem();
        instance.run();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
