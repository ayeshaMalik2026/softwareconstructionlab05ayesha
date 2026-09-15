# Lab Task 05 - Designing Specifications: Preconditions and Postconditions

## Class & Course Information
- **Course:** Software Construction
- **Class:** 5th Semester Software Engineering
- **Date:** September 15, 2026

## Objective
Apply concepts of method specifications, behavioral equivalence, fail-fast precondition validation, mutation contracts, and immutability using JUnit testing.

## Completed Tasks
1. **Behavioral Equivalence:** Implemented `findFirst` and `findLast` methods in `SearchStrategies.java` with JUnit tests demonstrating identical vs. differing outputs based on input arrays.
2. **Fail-Fast Preconditions:** Added altitude validation throwing `IllegalArgumentException` in `MathUtils.java` with `assertThrows` JUnit test verification.
3. **Mutation Contracts:** Built `sortInPlace` (mutating) and `toLowerCase` (non-mutating) in `ListFormatter.java` ensuring input parameter integrity.
4. **Immutability for Safer Contracts:** Created `Authenticator.java` demonstrating how returning mutable `char[]` leads to cache corruption while returning immutable `String` acts as a secure firewall.
5. **Declarative vs. Operational Specs:** Refactored internal loop descriptions into clear, declarative specification contracts in `StringOperations.java`.

## How to Run
1. Open the project in Apache NetBeans IDE.
2. Clean and build the project (`Shift + F11`).
3. Right-click test classes in `Test Packages` and click **Test File** (`Ctrl + F6`).
