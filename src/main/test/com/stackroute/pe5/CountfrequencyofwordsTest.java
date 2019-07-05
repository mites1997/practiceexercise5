package com.stackroute.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CountfrequencyofwordsTest {
    Countfrequencyofwords ob;
    @Before
    public void setUp() throws Exception {
        ob=new Countfrequencyofwords();
    }

    @After
    public void tearDown() throws Exception {
        ob=null;
    }

    @Test
    public void checkFrequency() {
        String expected="{one=5, two=2, three=2}";
        String actual=ob.checkFrequency("one one -one___two,,three,one @three*one?two");
        assertEquals(expected,actual);
    }

    @Test
    public void checkFrequencyNull() {
        String expected="wrong input";

        String actual=ob.checkFrequency(null);
        assertEquals(expected,actual);
    }
    @Test
    public void checkFrequencyNotNull() {

        String actual=ob.checkFrequency("Mites mrinoy");
        assertNotNull(actual);
    }
}

