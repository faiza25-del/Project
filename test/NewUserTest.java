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
public class NewUserTest {
    NewUser user;
    public NewUserTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        user=new NewUser();
    }
    
    @After
    public void tearDown() {
        user=null;
    }

    /**
     * Test of main method, of class NewUser.
     */
    @Test
    public void testuser(){
        int a=5,value;
        value=user.user(a);
        assertEquals(0,value);
    }
    
}
