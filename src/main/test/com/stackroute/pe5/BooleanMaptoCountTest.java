package com.stackroute.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BooleanMaptoCountTest {
    BooleanMaptoCount ob;

    @Before
    public void setUp() throws Exception {
        ob = new BooleanMaptoCount();
    }

    @After
    public void tearDown() throws Exception {
        ob = null;
    }

    @Test
    public void checkTrue() {
        String expected = "{a : true, b : false, c : false, d : false}";
        String arr[] = {"a", "b", "d", "a", "c", "a"};
        String actual = ob.checkIfTrue(String.join(" ", arr)).replaceAll("=", " : ");
        assertEquals(expected, actual);
    }

    @Test
    public void checkTrueNull() {

        String actual = ob.checkIfTrue(null);
        String expected = "wrong input";
        assertEquals(expected, actual);


    }

    @Test
    public void checkTruecase2() {
        String expected = "{a : false, b : false, c : false, d : false}";
        String arr[] = {"a", "b", "d", "c"};
        String actual = ob.checkIfTrue(String.join(" ", arr)).replaceAll("=", " : ");
        assertEquals(expected, actual);
    }
}