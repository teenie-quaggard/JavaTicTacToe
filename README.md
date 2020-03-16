# Java Tic Tac Toe

A simple Tic Tac Toe command line application built to learn Java, practice the SOLID principles and learn common object oriented programming patterns.

## 👻 Version 1.0 
![Imgur Image](https://imgur.com/I6o9Sov.jpg)
- Goal: a command line Tic Tac Toe game between two human players on a 3 x 3
 board
- At this point in time: a board is shown but players are not yet able to
 make a move.

## 🏁Getting started 
To run this project, you'll need to [JDK13](https://openjdk.java.net/projects/jdk/13/) 
and [JUnit5](https://junit.org/junit5/) installed on your computer. It may
 also be helpful to use an IDE that works well with Java such as [Eclipse](https://www.eclipse.org/downloads/packages/) 
 or, as I have used, [IntelliJ](https://www.jetbrains.com/idea/).
 
### Running Program
Coming soon

### Running Test Suite
Coming soon

## 📝Process
- This game employs the Factory design pattern in order to create a code base
that is easily extendable and that follows the single responsibility
principle. For more information about the Factory Pattern, [check this out](https://refactoring.guru/design-patterns/factory-method).
- In the beginning, I tried to employ an outside-in strategy (building up the
 top level interactions first), since I already felt that I had a sense for
  the architecture of the project. One problem I ran into time and time again
   was that I was unsure of how I should mock dependencies in the mean time
   . I think in the future, I could improve my implementation of ['mockist
    TDD'](https://martinfowler.com/articles/mocksArentStubs.html),

## 🤕Pain points
- Understanding the different Java types
- Getting accustomed to the shortcuts in IntelliJ
- Understanding Java syntax
- Knowing when to use the Factory pattern and when not to
- Understanding what is happening 'beneath the hood'; how do I run my
 programs and tests when not using the IDE?
- Sticking to TDD while working from the outside-in
