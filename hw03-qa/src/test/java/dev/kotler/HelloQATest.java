package dev.kotler;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class HelloQATest {

    @BeforeEach
    void setUp() {
        System.out.println("@BeforeEach");
    }

    @AfterEach
    void tearDown() {
        System.out.println("@AfterEach");
    }

    @Test
    void mainOneTest() {
        System.out.println("@Test");
        System.out.println("Hash: " + Integer.toHexString(hashCode()));
    }

    @Test
    void mainTwoTest() {
        System.out.println("@Test");
        System.out.println("Hash: " + Integer.toHexString(hashCode()));
    }
}