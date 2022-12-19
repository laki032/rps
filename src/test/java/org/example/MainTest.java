package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainTest {

    @Test
    void testPlayMethod() {
        Assertions.assertThrows(Exception.class, () -> Main.play(-10));
        Assertions.assertThrows(Exception.class, () -> Main.play(0));
        Assertions.assertDoesNotThrow(() -> Main.play(10));
    }
}
