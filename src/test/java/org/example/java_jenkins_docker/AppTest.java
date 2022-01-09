package org.example.java_jenkins_docker;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AppTest {
    
  @Test
  public void shouldAnswerWithTrue() {
    assertTrue(App.checkIfInputIsAnEvenNumber(22));
  }
}
