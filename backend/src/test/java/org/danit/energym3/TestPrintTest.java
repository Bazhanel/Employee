package org.danit.energym3;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class TestPrintTest {

  @Test
  public void TestPrint() {
  }

  @Test
  public void testCanonicalName() {
    TestPrint testPrint = new TestPrint();
    assertEquals("TestPrint", testPrint.getClass().getSimpleName());
  }

  @Test
  public void newTestPrintIsNotNull() {
    TestPrint tp = new TestPrint();
    assertNotNull(tp);
  }

  @Test(expected = NullPointerException.class)
  public void itShouldThrowNullPointerException() {
    TestPrint testPrint = null;
    System.out.println(testPrint.hashCode());
  }

  @Test
  public void canonicalNamesEquals() {
    TestPrint testPrint1 = new TestPrint();
    TestPrint testPrint2 = new TestPrint();
    assertEquals(testPrint1.getClass().getCanonicalName(), testPrint2.getClass().getCanonicalName());
  }

  @Test
  public void isInstanceOfTestClass() {
    TestPrint testPrint = new TestPrint();
    assertTrue(testPrint.getClass().isInstance(new TestPrint()));
  }

}