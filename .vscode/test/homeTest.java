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
public class homeTest {
    home h;
    
    public homeTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        h=new home();
    }
    
    @After
    public void tearDown() {
        h=null;
    }

    /**
     * Test of main method, of class home.
     */
    @Test
    public void testhome(){
        int a=5;
        int b=2;
        int c;
        c=h.home(a,b);
        assertEquals(3,c);
    }
    
}
