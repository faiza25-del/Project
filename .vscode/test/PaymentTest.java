/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Model.Payment;
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
public class PaymentTest {
    Payment p;
    public PaymentTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        p=new Payment();
    }
    
    @After
    public void tearDown() {
        p=null;
    }

    /**
     * Test of tableDetails method, of class Payment.
     */
    @Test
    
    public void testPayment(){
        int a=100,value;
        value=p.Payment(a);
        assertEquals(200,value);
    }

   
    
}
