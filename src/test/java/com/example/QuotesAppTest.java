package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class QuotesAppTest {

    @Test
    void shouldReturnQuote() {
        assertEquals(
            "Success comes from consistent practice!",
            QuotesApp.getQuote()
        );
    }
}
