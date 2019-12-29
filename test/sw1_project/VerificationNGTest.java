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
public class VerificationNGTest {
    
    public VerificationNGTest() {
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
     * Test of verifyCredit method, of class Verification.
     */
    @Test
    public void testVerifyCredit() {
        System.out.println("verifyCredit");
        Verification instance = new Verification();
        Boolean expResult = null;
        Boolean result = instance.verifyCredit();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of verifyLogin method, of class Verification.
     */
    @Test
    public void testVerifyLogin() {
        System.out.println("verifyLogin");
        String userName = "";
        String pass = "";
        Verification instance = new Verification();
        Boolean expResult = null;
        Boolean result = instance.verifyLogin(userName, pass);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
