package pl.ppluta.creditcard;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GreeterTest {
    @Test
    public void itGreetsByName() {
        //Arrange / Given
        String name = "Pawel";
        Greeter greeter = new Greeter();
        //Act / When
        String greetingText = greeter.hello(name);
        //Assert / Then
        assertEquals("Hello Pawel", greetingText);
    }
}
