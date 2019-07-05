package com.stackroute.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SortedListTest {
    SortedList ob;
    @Before
    public void setUp() throws Exception {
        ob=new SortedList();
    }

    @After
    public void tearDown() throws Exception {
        ob=null;
    }

    @Test
    public void sortArrayListUsingSortedSet() {
        String expected="[Alice, Bluto, Eugene, Harry, Olive]";
        String actual=ob.sortArrayListUsingSortedSet("Harry Olive Alice Bluto Eugene");
        assertEquals(expected,actual);
    }

    @Test
    public void sortArrayListUsingSortedSetNull() {

        String actual=ob.sortArrayListUsingSortedSet(null);
        assertNull(actual);
    }
    @Test
    public void sortArrayListUsingSortedSetCase2() {
        String expected="[bat, cat, rat]";
        String actual=ob.sortArrayListUsingSortedSet("bat cat rat");
        assertEquals(expected,actual);
    }
}