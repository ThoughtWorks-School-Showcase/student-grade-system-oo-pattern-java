# Student Grading System（OO Pattern）

## Business Requirements

We are going to develop an application. The application is a command line user interface application. When the program starts, we will see the main menu print at the command console as follows:

```
1. Add Student 
2. Generate Students Score Sheet 
3. Exist
Plase input your choice（1～3）： 
```

If we input 1，the application will display：

```
Please input student info（Format：Name, Number, Subject1: Score1, ...）
Press click Enter key to submit： 
```

If the input format is incorrect，the application will display：

```
Please input the correct format（Format：Name, Number, Subject1: Score1, ...）： 
```

If we input correct message, the application will display:

```
Student xxx's score has been added successfully! 
```

Then the application prints the menu again on the console:

```
1. Add Student 
2. Generate Students Score Sheet 
3. Exist
Plase input your choice（1～3）：
```

Now we come back on the main menu again. 
If we input 2，the application will display：

```
Please input the student number whose information you want to print（Format： number1, number2,...），
Press click Enter key to submit： 
```

If we input the correct message, the view will display:
```
Please input the correct student number（Format： number1, number2,...），
Press click Enter key to submit： 
```

If we input the correct message, the application will display the score sheet, and print the main menu:

```
1.	 SCORE SHEET
2.	 Name|Math|Chinese|English|Program|Average|Total
3.	 ======================== 
4.	 Tom|75|95|80|80|82.5|330 
5.	 Jason|85|80|70|90|81.25|325 
6.	 ======================== 
7.	 The Average of Total Score：xxx 
8.	 The Middle og Total Score：xxx 
```

If the student number that we input does not exist，the number will be ignored in the calculation process.

### Additional Business Requirement 1（Optional：

Add new strategy for adding score：


- minority +10(SCORE)
- Sports-specialty +20(SCORE)    
- Artistic-specialty： +15(SCORE)

If we input 1，the application will display：

```
Please input student info（Format：Name, Number, Nation, Class, Subject1: Score1, ...）
Press click Enter key to submit：  
```

If the input format is incorrect, the application will display：
```
Please input the correct format（Format：Name, Number, Nation, Class, Subject1: Score1, ...）： 
```

### Additional Business Requirement 2（Optional）:

Please save the student to file after we add any student info. When the application print student grade score sheet, the student info should be read from file.

## Challenges in the Exercise:
1. We need to implement a small but a complete application in the processes: Design, Tasking, Coding, Testing. 
2. Unit Test coverage need to be more than 90%.
3. Apply TDD to drive a complex implementation or multiple business scenario implementation.
4. Apply multiple-layer architecture design strategy and feature-based implementation.
5. The relationship between the classes should be clear, the responsibility of each class should be single.
6. Tasking is based on requirement scenario analysis. 
7. The OO Design Patten should be implemented, we should figure the pattern out and then use Command Patten, UnitOfWork Patten, Adapter Patten, Factory Method in the right way.
8. Figure out the code smell and refactor them to Clean Code (Readable, Maintainable etc.).
9. Give the meaningful names for the unit tests and methods.

## Practice Requirement：
1. Draw the tasking graph to down the responsibility.
2. Draw the tasking graph based on the business scenario.
3. Write the task list and estimate the complete time for each task.
4. Write the test cases.
5. Apply the TDD process.
6. Refactor the code with small steps.
7. Coding by IDE shortcuts.
8. Flow the Clean Code principle.
9. Commit Code by the small steps with the meaningful comment.

## Deliverable:
Please push all your deliverables repo to the repository site that coach will tell you. The repository should includes：
a)	Tasking file: tasking.md.
b)	Tasking graph: put to image folder under root.
c)	Code for the unit tests and implementation.
d)	The screenshot of the running app with all operation, put them to result folder under root. (file name: xxx.png)

## How to Begin:

Get the practice repository:
```
 git clone https://github.com/ThoughtWorks-School-Showcase/student-grade-system-oo-pattern-java
```

Stack Initial and build:

```
Mac/Linux: ./gradlew idea   
Whindows:  gradlew.bat idea  
```
```
Mac/Linux: ./gradlew clean build   
Whindows:  gradlew.bat clean build 
```

Test:
```
Mac/Linux: ./gradlew clean test 
Whindows:  gradlew.bat clean test.
```


## Learn Resourse(Chinese Version):
1. [任务分解](https://www.zybuluo.com/jtong/note/504192)
2. [Gradle基础教程](http://tutorials.jenkov.com/gradle/gradle-tutorial.html)
3. [Java 基础](http://www.runoob.com/java/java-tutorial.html)
4. [Git 参考手册](http://gitref.org/zh/index.html)
5. [Junit](http://junit.org/junit5/docs/current/user-guide/#writing-tests-assertions)
6. [Mockito](http://site.mockito.org/)

