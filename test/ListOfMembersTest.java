/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Model.ListOfMembers;
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
public class ListOfMembersTest {
    ListOfMembers l;
    public ListOfMembersTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        l=new ListOfMembers();
    }
    
    @After
    public void tearDown() {
        l=null;
    }

    /**
     * Test of main method, of class ListOfMembers.
     */
    @Test
    public void testList(){
        String a="newmember";
        String b=l.List(a);
        assertEquals(a,b);
    }
    
}
