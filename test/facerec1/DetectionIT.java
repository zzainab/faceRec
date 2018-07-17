/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facerec1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author User
 */
public class DetectionIT {
    
    public DetectionIT() {
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
     * Test of webcam method, of class Detection.
     */
    @Test
    public void testWebcam() {
        System.out.println("webcam");
        Detection instance = new Detection();
        instance.webcam();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of CaptureImage method, of class Detection.
     */
    @Test
    public void testCaptureImage() {
        System.out.println("CaptureImage");
        Detection instance = new Detection();
        instance.CaptureImage();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class Detection.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Detection.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
