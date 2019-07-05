package com.stackroute.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import java.util.*;

public class ReplaceValueinMapsTest {
ReplaceValueinMaps ob;
    @Before
    public void setUp() throws Exception {
        ob=new ReplaceValueinMaps();
    }

    @After
    public void tearDown() throws Exception {
        ob=null;
    }

    @Test
    public void rotateValue() {
        String expexted="{val2=java, val1= }";
        Map<String, String> map=new HashMap<>();
        map.put("val1","java");
        map.put("val2","c++");
        String actual=ob.replaceValue(map);
        assertEquals(expexted,actual);
    }

    @Test
    public void rotateValueSecond() {
        String expexted="{val2=mars, val1= }";
        Map<String, String> map=new HashMap<>();
        map.put("val1","mars");
        map.put("val2","saturn");
        String actual=ob.replaceValue(map);
        assertEquals(expexted,actual);
    }

    @Test
    public void rotateValueNull() {

        String actual=ob.replaceValue(null);
        assertNull(actual);
    }
}