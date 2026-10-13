# Koun Banega Crorepatti — Java Console Quiz Game

A console-based quiz game in Java inspired by the TV show *Kaun Banega Crorepati*. Players answer a series of multiple-choice questions to win prize money, from Rs 1,000 up to Rs 7 Crore.

## Features

- **Prize Ladder:** 17 levels, from Rs 1,000 to Rs 7 Crore.
- **Random Questions:** Questions are picked randomly from the question bank, split into an easier and a harder round.
- **Multi-Language Questions:** The question bank includes English, Hindi, and Gujarati questions.
- **Instant Result:** A wrong answer ends the game, and the last amount won is kept.
- **Milestone Messages:** Special messages are shown at the Rs 10,000 and Rs 3,20,000 levels.
- **Simple Console Interface:** Answer by typing A, B, C, or D (lowercase also works).

## Technologies Used

- **Java** — Core programming language
- **Scanner** — Taking user input
- **Random** — Random question selection

## Project Structure

```
src/
└── KBC/
    ├── BSH.java                          # Question bank and display methods
    └── BSH_Koun_Banega_Crorepatti.java   # Main game logic
```

## Getting Started

### Requirements

- Java JDK 17 or higher

### 1. Clone the Repository

```bash
git clone https://github.com/ashish-vaghjiyani/Koun-Banega-Crorepatti.git
```

### 2. Navigate to the Project Directory

```bash
cd Koun-Banega-Crorepatti
```

### 3. Compile

```bash
javac -d out src/KBC/*.java
```

### 4. Run

```bash
java -cp out KBC.BSH_Koun_Banega_Crorepatti
```

**Note:** Hindi and Gujarati questions need a console that supports Unicode text. If the text looks broken, run the project from an IDE such as IntelliJ IDEA.

## Project Objective

This project was built to practice core Java concepts such as classes, methods, arrays, loops, conditional statements, random number generation, and user input handling.

## Future Improvements

- Add lifelines such as 50-50 and Audience Poll.
- Move the questions and answers into a separate data structure or file.
- Add more questions and difficulty levels.
- Add a score history or leaderboard.

## Developer

**Ashish Vaghjiyani**

B.Tech Computer Engineering Student

---

Koun Banega Crorepatti — a simple Java quiz game built for practice and learning.
