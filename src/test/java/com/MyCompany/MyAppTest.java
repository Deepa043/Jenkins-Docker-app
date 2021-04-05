package com.MyCompany;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.Before;
import org.junit.Test;

import com.myCompany.MyApp;

import org.junit.After;
import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class MyAppTest
{

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void testAppConstructor() {
        try {
            new MyAppTest();
        } catch (Exception e) {
            fail("Construction failed.");
        }
    }

    @Test
    public void testAppMain()
    {
        MyApp.main(null);
        try {
            assertEquals("Hello World,How are You?" + System.getProperty("line.separator"), outContent.toString());
        } catch (AssertionError e) {
            fail("\"message\" is not \"Hello World,How are You?\"");
        }
    }

    @After
    public void cleanUpStreams() {
        System.setOut(null);
    }

}
