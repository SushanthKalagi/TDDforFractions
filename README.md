# TDD for Fractions

A Java implementation of a Fraction class developed using Test-Driven Development (TDD). This project demonstrates handling of fraction operations while maintaining reduced form and proper sign conventions.

## Features

- Basic fraction arithmetic (addition)
- Automatic fraction reduction
- Proper handling of:
  - Zero fractions
  - Negative fractions
  - Fractions with negative denominators
  - Common and non-common denominators

## Test Cases

The implementation is verified through the following test scenarios:

1. Zero addition (`0 + 0`)
2. Non-zero plus zero (`3 + 0`)
3. Positive operands (`3 + 1`)
4. Negative operands (`-3 + 1`)
5. Common denominators (`1/5 + 2/5`)
6. Different denominators (`1/2 + 1/3`)
7. Reducible fractions (`2/4 + 1/2`)
8. Negative denominators (`2/7 + 1/-3`)

