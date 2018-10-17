package org.danit.energym3;

import org.junit.Test;

import static org.junit.Assert.*;

public class TestClassTest {

  @Test
  public void newInstanceIsNotNull(){
    TestClass testClass = new TestClass();
    assertNotNull(testClass);
  }

  @Test
  public void instancesNotEquals(){
    TestClass testClass1 = new TestClass();
    TestClass testClass2 = new TestClass();
    assertNotEquals(testClass1,testClass2);

  }

}