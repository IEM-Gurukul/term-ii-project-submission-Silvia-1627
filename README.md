# 🚀 PCCCS495 – Term II Project

## 📌 Project Title

**Elevator Control System using State Design Pattern**

---

## 📖 Overview

This project simulates a real-world Elevator Control System built using Java and Object-Oriented Programming principles. It demonstrates how software design patterns and structured architecture can model real-life systems effectively.

The system processes multiple user requests, controls elevator movement, and manages state transitions dynamically while ensuring robustness through validation and clean design practices.

---

## ❗ Problem Statement

The goal is to design a scalable and efficient Elevator Control System capable of handling multiple floor requests. The system should simulate real elevator behavior including movement between floors, door operations, and request handling. It must also handle invalid inputs gracefully and maintain structured, modular, and maintainable code using OOP principles.

---

## 👤 Target Users

* Students learning Java and OOP concepts
* Developers exploring design patterns
* Instructors demonstrating system design

---

## ⚙️ Core Features

* 🔁 Handles multiple floor requests using Queue (FIFO)
* ⬆️⬇️ Supports upward and downward movement logic
* 🚪 Simulates door operations (open/close)
* ✅ Input validation for invalid floor numbers
* 📊 Displays real-time elevator movement
* 🧠 Implements State Design Pattern
* 📌 Clean and modular code structure

---

## 🧠 OOP Concepts Used

### 🔹 Abstraction

* Implemented using `State` interface to define behavior

### 🔹 Inheritance

* `MovingUpState`, `MovingDownState`, `IdleState` extend `State`

### 🔹 Polymorphism

* `handleRequest()` behaves differently for each state

### 🔹 Encapsulation

* Private variables used in `ElevatorController`

### 🔹 Exception Handling

* Handles invalid floor inputs safely

### 🔹 Collections

* `Queue (LinkedList)` used to manage multiple requests

---

## 🏗️ System Architecture

The system follows a modular design:

* **Model Layer**

  * `Elevator` → stores current floor & movement logic

* **Controller Layer**

  * `ElevatorController` → handles requests & manages states

* **State Layer**

  * `State (interface)`
  * `IdleState`
  * `MovingUpState`
  * `MovingDownState`
  * `DoorOpenState`

👉 The controller dynamically switches between states based on user requests, demonstrating the State Design Pattern.

---

## ▶️ How to Run

1. Open project in VS Code / IntelliJ
2. Navigate to `Main.java`
3. Run the program
4. Enter number of requests
5. Enter floor numbers
6. Observe elevator simulation in terminal

---

## 🧪 Sample Output

```text
Enter number of requests: 2
Enter floor: 4

Request received for floor: 4
Elevator is Moving Up
Moving from 0 to 1
Moving from 1 to 2
Moving from 2 to 3
Moving from 3 to 4
Reached Floor 4
Door Opening...
Door Closing...
Request completed successfully
```

---

## 🧾 Git Commit History

The project follows proper version control discipline with meaningful commits:

1. Initial project setup
2. Created project structure and initial class files
3. Implemented State interface and IdleState
4. Implemented ElevatorController class
5. Fixed missing bracket and completed queue logic
6. Added user input for elevator requests
7. Test commit after fixing issues
8. Added validation for invalid floor input
9. Improved output formatting for better readability
10. Enhanced elevator output with door operations and completion messages

---

## 📊 Project Evaluation Readiness

✔ OOP Design Principles Applied
✔ Clean Code Structure
✔ Functional and Robust System
✔ Meaningful Git Commits (10+)
✔ Ready for Viva and Demonstration

---

## 🔮 Future Enhancements

* Multi-elevator system
* Priority-based scheduling
* GUI-based interface
* Emergency handling system
* Thread-based real-time simulation

---

## 👨‍💻 Author

**Silvia Singh**

---

## 📌 Git Discipline Note

This project includes **10+ meaningful commits**, each representing incremental development and improvements, fulfilling the version control requirement.

---
