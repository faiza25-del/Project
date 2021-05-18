/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.sql.Connection;
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
public class ConnectionProviderTest {
    ConnectionProvider c;
    public ConnectionProviderTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        c=new ConnectionProvider();
    }
    
    @After
    public void tearDown() {
        c=null;
    }

    /**
     * Test of getCon method, of class ConnectionProvider.
     */
    @Test
    public void testconnection(){
        String s="connected";
        String t=c.connection(s);
        assertEquals(s,t);
    }
    
}
