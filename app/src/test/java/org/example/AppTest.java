package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
  @Test
  void itHasAGreeting() {
    App helloWorld = new App();
    assertNotNull(helloWorld.getGreeting());
  }
}
