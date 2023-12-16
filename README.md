# SOLID-principles
## Overview  : 
### The SOLID Principles are five principles of Object-Oriented class design. They are a set of rules and best practices to follow while designing a class structure. The reason for that principles is that "To create understandable, readable, and testable code that many developers can collaboratively work on."

We have 5 principles 
1-	Single responsibility principle 
2-	Open _ closed principle 
3-	Liskov substitution principle
4-	Interface segregation principle
5-	Dependency inversion principle 




## Single Responsibility Principle (SRP)
In this principle class should be having one and only one responsibility .in other words ,
A class should have one and only one reason to change, meaning that a class should have only one job.

### For example :
### Before SRP

![BSR](https://github.com/ziadahmed123/SOLID-principles/assets/85025911/888d6576-8b66-4a15-bbb0-93c8a7fd1e15)


![BSR1](https://github.com/ziadahmed123/SOLID-principles/assets/85025911/81526a2a-f2b3-48c9-b323-53cec8f5abc5)

in that example we put the method which print all student info in the same class and we need to do that
lets see how SRP solve that :

### After SRP :

![SR](https://github.com/ziadahmed123/SOLID-principles/assets/85025911/f8297d9f-58bc-4411-9635-47097c7a5268)

![SR1](https://github.com/ziadahmed123/SOLID-principles/assets/85025911/8601518e-7d85-4d94-a225-acce1359fbcd)


![SR2](https://github.com/ziadahmed123/SOLID-principles/assets/85025911/6610d9c8-0c20-4ce7-b10a-9abc4e6a3071)


After SRP we make the print student in anather class 
that will help us when we any class need modification we will modify it alone and dont need to modify the other class 



