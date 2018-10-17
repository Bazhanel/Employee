package org.danit.energym3;

import org.junit.Test;
import org.springframework.boot.test.autoconfigure.data.redis.DataRedisTest;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.Assert.*;


public class TestClassTest {

  @Test
  public void TestClass() {
  }

  @Test
  public void newInstanceIsNotNull() {
    TestClass testClass = new TestClass();
    assertNotNull(testClass);
  }

  @Test
  public void instancesNotEquals() {
    TestClass testClass1 = new TestClass();
    TestClass testClass2 = new TestClass();
    assertNotEquals(testClass1, testClass2);
  }

  @Test(expected = NullPointerException.class)
  public void itShouldThrowNullPointerExceptionWhen() {
    TestClass testClass = null;
    System.out.println(testClass.hashCode());
  }

  @Test
  public void canonicalNamesEquals() {
    TestClass testClass1 = new TestClass();
    TestClass testClass2 = new TestClass();
    assertEquals(testClass1.getClass().getCanonicalName(), testClass2.getClass().getCanonicalName());
  }

  @Test
  public void isInstanceOfTestClass() {
    TestClass testClass = new TestClass();
    assertTrue(testClass.getClass().isInstance(new TestClass()));
  }

}