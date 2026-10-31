
# Java Number Analyzer

A simple command-line application written in Java that analyzes integers and displays their mathematical properties.

This project demonstrates fundamental Java programming concepts, including methods, loops, conditionals, input validation, and basic algorithms.

## Features

For each integer, the application:

- Determines whether it is even or odd
- Identifies whether it is positive, negative, or zero
- Checks divisibility by 3
- Checks whether the number is prime
- Reverses its digits
- Checks whether it is a palindrome
- Handles invalid inputs and integer overflow

## Technologies

- Java
- Java Development Kit (JDK)
- Git

## Getting Started

### Requirements

- JDK 21 or newer

### Compilation

```bash
javac NumberAnalyzer.java
```

### Execution

```bash
java NumberAnalyzer 7 12 -123 121 0
```

## Example Output

```text
Number: 7
Parity: Odd
Sign: Positive
Divisible by 3: false
Prime: true
Reverse: 7
Palindrome: true
------------------------
Number: 12
Parity: Even
Sign: Positive
Divisible by 3: true
Prime: false
Reverse: 21
Palindrome: false
------------------------
```

## Error Handling

The application handles:

- Non-integer command-line arguments
- Missing arguments
- Integer overflow during digit reversal

Invalid arguments are reported without stopping the processing of subsequent inputs.

## What I Learned

- Working with methods and control flow in Java
- Implementing basic mathematical algorithms
- Improving algorithm efficiency
- Handling exceptions and edge cases
- Structuring command-line output

## Future Improvements

- Automated unit tests
- Additional mathematical operations
- Improved command-line interface
