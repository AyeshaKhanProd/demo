package com.first.dependency.demo;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TaskTest {

    @Test
    void mask() {
        String name = "Ayeshakh n";
        assertEquals(Task.mask("Ayeshakha n"),"*******ha n");
    }
    @Test
    void checkNullString(){
        String name = null;
        assertEquals(Task.mask(name),"Name can not be null or empty");
    }

    @Test
    void checkEmptyString(){
        String name = "";
        assertEquals(Task.mask(name),"Name can not be null or empty");
    }
}