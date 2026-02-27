# Reverse a String (Java)

## Problem Description
Given an input string, return a new string with characters in reverse order.

This project provides a production-ready Java implementation of string reversal using the two-pointer technique, with comprehensive JUnit 5 tests.

## Example Input/Output
**Input:** `"hello"`  
**Output:** `"olleh"`

## Approach Explanation (Two-Pointer Technique)
The algorithm converts the input string into a character array, then uses two pointers:
- `left` starts at the beginning.
- `right` starts at the end.

Characters at `left` and `right` are swapped, then both pointers move inward until they meet.  
This performs an in-place reversal on the array and avoids repeated string concatenation overhead.

## Algorithm Steps
1. Validate input is not `null`; throw `IllegalArgumentException` if it is.
2. If length is `0` or `1`, return the input as-is.
3. Convert string to `char[]`.
4. Initialize two pointers: `left = 0`, `right = length - 1`.
5. While `left < right`, swap `chars[left]` with `chars[right]`, increment `left`, decrement `right`.
6. Return `new String(chars)`.

## Time & Space Complexity
- **Time Complexity:** `O(n)` where `n` is the input length.
- **Space Complexity:** `O(n)` due to the `char[]` copy from immutable `String`.

## Edge Cases Considered
- `null` input -> throws `IllegalArgumentException`
- Empty string `""` -> returns `""`
- Single character `"a"` -> returns `"a"`
- Strings with spaces -> handled correctly
- Strings with special characters -> handled correctly
- Palindromes -> output remains the same
- Very large strings -> covered by test scenario

## Follow-up Optimization (Using StringBuilder.reverse())
For quick implementation, Java provides:

```java
String reversed = new StringBuilder(input).reverse().toString();
```

## How to Run
### Prerequisites
- Java 17+
- Maven 3.9+

### Commands
```bash
# Compile
mvn clean compile

# Run tests
mvn test
```

## Project Structure
```text
string-reverse/
├── pom.xml
├── README.md
├── src/
│   ├── main/
│   │   └── java/
│   │       └── com/
│   │           └── example/
│   │               └── stringreverse/
│   │                   └── StringReverser.java
│   └── test/
│       └── java/
│           └── com/
│               └── example/
│                   └── stringreverse/
│                       └── StringReverserTest.java
```
