<div align="center">

# ☕ Java OOP Mastery

### A hands-on journey through Java fundamentals and Object-Oriented Programming

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Status](https://img.shields.io/badge/Status-In_Progress-brightgreen?style=for-the-badge)
![OOP](https://img.shields.io/badge/Focus-OOP_Concepts-blue?style=for-the-badge)

*Learning Java one concept at a time — from variables to full mini-projects.*

</div>

---

## 📌 About This Repo

This repository is my personal practice log for learning **Java** and **Object-Oriented Programming (OOP)**. Each folder is a self-contained topic with exercises, building progressively from basic syntax to advanced OOP design principles and a real mini-project.

---

## 🗂️ Progress Tracker

Each topic folder contains **3 exercises**, where every `.java` file is named after the problem it solves (e.g. `StudentManagementSystem.java`,`LibraryManagemtSystem.java`,`BankingSystem.java`), with the **question written as a comment at the top of the file**.

| # | Topic | Exercises | Status |
|---|-------|:---:|:------:|
| 01 | Basics | 3 | ✅ |
| 02 | Input Operators | 3 | ✅ |
| 03 | If-Else | 3 | ✅ |
| 04 | Loops | 3 | ✅ |
| 05 | Arrays | 3 | ✅ |
| 06 | Methods | 3 | ✅ |
| 07 | Classes & Objects | 3 | ✅ |
| 08 | Constructors | 3 | ✅ |
| 09 | Encapsulation | 3 | ✅ |
| 10 | Inheritance | 3 | ✅ |
| 11 | Polymorphism | 3 | ✅ |
| 12 | Abstraction & Interfaces | 3 | ✅ |
| 13 | Exception Handling | 3 | ✅ |
| 14 | ArrayList | 3 | ✅ |
| 15 | Mini Projects | 3 | ✅ |

---

## 📁 Folder & File Convention

```
15-mini-projects/
├── StudentManagementSystem.java
├── LibraryManagementSystem.java
└── BankingSystem.java
```

Every file follows the same pattern — the problem statement lives right above the code as a comment block, so each exercise is self-explanatory:

```java
/*
Project 2: Library Management System

Develop a console-based Java application that manages library books.

The system should allow users to:
- Add new books.
- Borrow available books.
- Return borrowed books.
- View all books and their availability status.

Each book should contain information such as book ID, title, author, and availability status.
 */

public class LibraryManagementSystem {
    // solution code...
}
```

---

## 🧠 OOP Concepts, Explained Simply

> The four pillars of OOP, broken down with everyday analogies.

### 1️⃣ Encapsulation — *"Keep it private, expose what's needed"*
Bundling data (fields) and the methods that work on that data into one unit (a class), while hiding the internal details from the outside world.

> 🔑 Think of a **capsule pill**: the medicine is sealed inside, you don't touch the ingredients directly — you just take the pill.

```java
public class BankAccount {
    private double balance; // hidden from outside

    public double getBalance() {
        return balance; // controlled access
    }
}
```

### 2️⃣ Inheritance — *"Reuse what already exists"*
A class (child/subclass) can inherit fields and methods from another class (parent/superclass), promoting code reuse.

> 🔑 Think of a **family tree**: a child inherits traits from their parents but can also have their own unique features.

```java
class Animal {
    void eat() { System.out.println("Eating..."); }
}

class Dog extends Animal {
    void bark() { System.out.println("Barking..."); }
}
```

### 3️⃣ Polymorphism — *"One action, many forms"*
The same method name can behave differently depending on the object calling it — either through method overriding (runtime) or overloading (compile-time).

> 🔑 Think of a **person**: the same person acts as a *student* in school, an *employee* at work, and a *parent* at home — same person, different behavior.

```java
class Shape {
    void draw() { System.out.println("Drawing a shape"); }
}

class Circle extends Shape {
    @Override
    void draw() { System.out.println("Drawing a circle"); }
}
```

### 4️⃣ Abstraction — *"Show what it does, hide how it does it"*
Exposing only the essential features of an object while hiding the complex implementation details, often using abstract classes or interfaces.

> 🔑 Think of **driving a car**: you use the steering wheel and pedals without knowing how the engine works internally.

```java
interface Vehicle {
    void start(); // what it does, not how
}

class Car implements Vehicle {
    public void start() { System.out.println("Car starts with a key"); }
}
```

---

## 🛠️ Tech Stack

- **Language:** Java ☕
- **Paradigm:** Object-Oriented Programming
- **Tools:** JDK, VS Code, Git & GitHub

---

## 🚀 How to Run

```bash
# Clone the repository
git clone https://github.com/your-username/your-repo-name.git

# Navigate into any topic folder
cd 15-mini-projects

# Compile and run a specific exercise
javac BankingSystem.java
java BankingSystem
```

---

## 🎯 Goal

To build a rock-solid foundation in Java OOP through consistent, practical exercises — moving from core syntax to real-world design patterns and mini-projects like the **Banking System**.

---

<div align="center">

### 📬 Connect

*Feel free to explore, fork, and follow along with my learning journey!*

⭐ **If you find this useful, consider giving it a star!**

</div>
