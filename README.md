## Java Solutions

This repository contains my solved exercises from the official Computer Science Bagrut exams and my little Java own Projects.
All code is written in Java by me and demonstrates knowledge of:

* OOP (Object-Oriented Programming)
* Arrays and data types from Collections library
* Inheritance and polymorphism
* Algorithms and problem solving

These tasks were solved as part of preparation for the CS exam and also include real exams, and show understanding of Java fundamentals.

## Included folders

* bagrut-2018** — Airport / OOP task  
* bagrut-2019** — Arrays, logic, objects  
* bagrut-2021** — MyString implementation  
* exam-suggested** — Real exam (PDF + solved question)   
*TicTacToes - Practice how to Build game and Double Array comunication
Each folder contains:
* Original source code
* Clean project structure ready for review


##  Notes
- All code here is based on real exam-style tasks and my own practice solutions.
- The goal is to show clear, readable Java code and Familiarity with strong typing and algorithmic principles

## Technical concepts demonstration

### 1. Object-Oriented Programming (OOP)

**Encapsulation**
- Used in classes like `Car` and `MyString`: fields are `private` with public getters/setters  
  (`Car` – `licenseNum`, `hadAccident`, `price`; `MyString` – `str`).
- Enforces data integrity and controlled access.

**Constructors & overloading**
- Multiple constructors in classes such as `Car` and `AA`:
  - Default constructor with sensible defaults.
  - Parameterized constructor that validates and normalizes input.
- Shows understanding of initialization patterns and constructor overloading.

**Inheritance**
- Implemented in the exam solution classes `AA` and `BB` (`BB extends AA`).
- Demonstrates code reuse and specialization by extending a base class.

**Polymorphism**
- Methods like `isLike(Object obj)` use `Object` + `instanceof` and casting to work with both `AA` and `BB`.
- Shows dynamic behavior based on the actual runtime type, not just the reference type.

**Method overriding**
- `BB` overrides `toString()` and `isLike()` from `AA`.
- Demonstrates how to change or extend behavior of a parent class.

**Composition**
- `Airport` contains an array of `Flight` objects (`Flight[] flights`).
- Models “has-a” relationships between objects.

---

### 2. Data structures & collections

**Arrays of objects**
- `Flight[]` in `Airport`, `Car[]` in the 2019 exam, and `char[]` inside `MyString`.
- Used for searching, filtering and iterating over multiple domain objects.

**Character arrays and String tools**
- `MyString` converts `String` to `char[]`, scans and modifies characters,
  and then rebuilds a string with `String.valueOf()` or `StringBuffer`.
- This shows understanding of low-level string manipulation, not just using high-level helpers.

**Binary trees**
- In the included exam solution (`BinNode<Integer>`), a binary tree is built and analyzed.
- The recursive `isNice(BinNode<Integer> tree)` function:
  - Traverses the tree,
  - Checks constraints on node values,
  - Demonstrates recursion and tree algorithms.

**Collections (ArrayList)**
- In the suggested exam solution you work with `ArrayList`:
  - Used to accumulate paths or node values from the binary tree.
  - Shows familiarity with Java Collections Framework beyond raw arrays.

---

### 3. Algorithms and patterns

**Searching and filtering**
- `Airport.isFly()` scans an array of flights and checks conditions on each element
  ( `getName().equals("Sky")`).
- Similar linear scans appear in other tasks for finding matches or counting elements.

**String processing algorithms**
- Counting occurrences of a character in `MyString.countChar(char ch)`.
- Removing characters by transforming the string to a `char[]`, editing in place, and converting back.
- Appending characters with `StringBuffer` to keep operations efficient.

**Validation and defensive programming**
- In classes like `Car`, setters can validate input (non-negative prices).
- Constructors funnel all initialization through these setters.

**Recursive logic**
- Tree-checking functions (`isNice`) use recursion with clear base cases and branching logic (`if`, `else if`, `else`).
- Demonstrates understanding of recursive traversal patterns on tree structures.

