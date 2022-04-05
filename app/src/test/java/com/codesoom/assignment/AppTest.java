package com.codesoom.assignment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;


class AppTest {

    @Test
    void getGreeting() {
        App classUserTest = new App();
        assertNotNull(classUserTest.getGreeting(), "app should have a greeting");
        assertEquals(classUserTest.getGreeting(), "Hello, world!");
    }
}