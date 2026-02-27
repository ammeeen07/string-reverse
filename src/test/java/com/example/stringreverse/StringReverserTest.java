package com.example.stringreverse;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class StringReverserTest {

    private final StringReverser reverser = new StringReverser();

    @Test
    @DisplayName("Should reverse normal string")
    void shouldReverseNormalString() {
        assertEquals("olleh", reverser.reverse("hello"));
    }

    @Test
    @DisplayName("Should reverse even length string")
    void shouldReverseEvenLengthString() {
        assertEquals("dcba", reverser.reverse("abcd"));
    }

    @Test
    @DisplayName("Should reverse odd length string")
    void shouldReverseOddLengthString() {
        assertEquals("edcba", reverser.reverse("abcde"));
    }

    @Test
    @DisplayName("Should handle empty string")
    void shouldHandleEmptyString() {
        assertEquals("", reverser.reverse(""));
    }

    @Test
    @DisplayName("Should handle single character")
    void shouldHandleSingleCharacter() {
        assertEquals("x", reverser.reverse("x"));
    }

    @Test
    @DisplayName("Should reverse string with spaces")
    void shouldReverseStringWithSpaces() {
        assertEquals("avaJ olleH", reverser.reverse("Hello Java"));
    }

    @Test
    @DisplayName("Should reverse string with special characters")
    void shouldReverseStringWithSpecialCharacters() {
        assertEquals("!321#@cba", reverser.reverse("abc@#123!"));
    }

    @Test
    @DisplayName("Should keep palindrome unchanged after reverse")
    void shouldReversePalindromeString() {
        assertEquals("madam", reverser.reverse("madam"));
    }

    @Test
    @DisplayName("Should throw exception when input is null")
    void shouldThrowExceptionWhenInputIsNull() {
        assertThrows(IllegalArgumentException.class, () -> reverser.reverse(null));
    }

    @Test
    @DisplayName("Should reverse very large string")
    void shouldReverseVeryLargeString() {
        StringBuilder builder = new StringBuilder(100_000);
        for (int i = 0; i < 100_000; i++) {
            builder.append((char) ('a' + (i % 26)));
        }
        String input = builder.toString();

        String reversed = reverser.reverse(input);

        assertEquals(input.length(), reversed.length());
        assertEquals(input.charAt(0), reversed.charAt(reversed.length() - 1));
        assertEquals(input.charAt(input.length() - 1), reversed.charAt(0));
    }
}
