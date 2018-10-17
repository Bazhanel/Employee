package org.danit.energym3;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertNotNull;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Energym3ApplicationTests {

  @Test
  public void contextLoads() {
  }

  @Test
  public void isHashIsNotNull() {
    Energym3Application app = new Energym3Application();
    assertNotNull(app.hashCode());
  }

  @Test
  public void newINstanseNotNull() {
    Energym3Application energym3Application = new Energym3Application();
    assertNotNull(energym3Application);
  }

  @Test
  public void mainWithArgs() {
    Energym3Application.main(new String[]{
      "--spring.main.web-environment=false",
      "--spring.autoconfigure.exclude=blahblahblah",
      // Override any other environment properties according to your needs
    });
  }

}
