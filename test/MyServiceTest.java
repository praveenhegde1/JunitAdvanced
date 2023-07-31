package test;

import org.junit.jupiter.api.Test;

import src.MyService;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class MyServiceTest {
    private final MyService myService = new MyService();

    @Test
    public void testIllegalArgumentException() {
        int invalidValue = -5;
        assertThrows(IllegalArgumentException.class, () -> myService.doSomething(invalidValue));
    }

    @Test
    public void testIllegalArgumentExceptionpos() {
        int invalidValue = 150;
        assertThrows(IllegalArgumentException.class, () -> myService.doSomething(invalidValue));
    }

    @Test
    public void testSuccessfulExecution() {
        int validValue = 42;
        assertDoesNotThrow(() -> myService.doSomething(validValue));
    }

    
    

   
    
    
}

