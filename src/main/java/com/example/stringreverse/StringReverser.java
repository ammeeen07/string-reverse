package com.example.stringreverse;

/**
 * Provides utilities for reversing strings.
 */
public class StringReverser {

    /**
     * Reverses the input string using a two-pointer character swap technique.
     *
     * @param input the string to reverse
     * @return reversed string
     * @throws IllegalArgumentException if input is {@code null}
     */
    public String reverse(String input) {
        if (input == null) {
            throw new IllegalArgumentException("Input string must not be null.");
        }
        if (input.length() <= 1) {
            return input;
        }

        char[] chars = input.toCharArray();
        int left = 0;
        int right = chars.length - 1;

        while (left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }

        return new String(chars);
    }
}
