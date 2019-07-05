package com.stackroute.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class UpdateandemptyArraylistTest {
  UpdateandemptyArraylist ob;

  @Before
  public void setUp() throws Exception {
    ob = new UpdateandemptyArraylist();
  }

  @After
  public void tearDown() throws Exception {
    ob = null;
  }

  @Test
  public void addArray() {
    String expected = "[Kiwi, Grape, Mango, Berry]";
    String actual = ob.converttoArray("Kiwi Grape Mango Berry".split(" ")).toString();
    assertEquals(expected, actual);
  }

  @Test
  public void removeAll() {
    String expected = "[]";
    ob.converttoArray("Kiwi Grape Mango Berry".split(" "));
    String actual = ob.removeAllOccurences().toString();
    assertEquals(expected, actual);
  }

  @Test
  public void update() {
    String expexted = "[Kiwi, Grape, Mango, Berry]";
    ob.converttoArray("Apple Grape Melon Berry".split(" "));
    ob.updateValues(0, "Kiwi");

    String actual = ob.updateValues(2, "Mango").toString();
    assertEquals(expexted, actual);

  }
}
