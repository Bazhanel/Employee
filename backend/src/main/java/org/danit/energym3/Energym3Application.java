package org.danit.energym3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("org.danit")
@SpringBootApplication
public class Energym3Application {

  public static void main(String[] args) {
    SpringApplication.run(Energym3Application.class, args);
  }
}
