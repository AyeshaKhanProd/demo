package com.first.dependency.demo;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.test.web.client.ExpectedCount;

import static org.junit.jupiter.api.Assertions.*;

class TaskTest {

    @Test
    void mask() {
        String name = "Ayeshakh n";
        assertEquals(Task.mask("Ayeshakha n"),"*******ha n");
    }
    @Test
    void checkNullString(){
        Exception exception = assertThrows(NullPointerException.class,() -> {
            Integer.parseInt(Task.mask(null));
        });
        assertTrue(exception.getMessage().contains("Name can not be null or empty"));
    }

    @Test
    void checkEmptyString(){
        Exception exception = assertThrows(NullPointerException.class,() -> {
            Integer.parseInt(Task.mask(null));
        });
        assertTrue(exception.getMessage().contains("Name can not be null or empty"));
    }
}