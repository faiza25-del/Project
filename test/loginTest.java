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
 * @author USER
 */
public class loginTest {
    login l;
    
    public loginTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
       l=new login();
    }
    
    @After
    public void tearDown() {
        l=null;
    }

    /**
     * Test of main method, of class login.
     */
    @Test
    public void testname(){
        String name="gms";
        String n=l.name(name);
        assertEquals("gms",n);
    }
    @Test
    public void testpassword(){
        String pass="admin";
        String p=l.password(pass);
        assertEquals("admin",p);
    }
    
}
