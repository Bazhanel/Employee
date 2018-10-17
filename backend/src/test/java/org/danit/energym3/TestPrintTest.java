package org.danit.energym3;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class TestPrintTest {

  @Test
  public void newTestPrintIsNotNull() {
    TestPrint tp = new TestPrint();
    assertNotNull(tp);
  }

}