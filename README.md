# SOLID-principles
## Overview  : 
### The SOLID Principles are five principles of Object-Oriented class design. They are a set of rules and best practices to follow while designing a class structure. The reason for that principles is that "To create understandable, readable, and testable code that many developers can collaboratively work on."

We have 5 principles 
1-	Single responsibility principle 
2-	Open _ closed principle 
3-	Liskov substitution principle
4-	Interface segregation principle
5-	Dependency inversion principle 




## 1- Single Responsibility Principle (SRP)
In this principle class should be having one and only one responsibility .in other words ,
A class should have one and only one reason to change, meaning that a class should have only one job.

### For example :
### Before SRP

![BSR](https://github.com/ziadahmed123/SOLID-principles/assets/85025911/888d6576-8b66-4a15-bbb0-93c8a7fd1e15)



in that example we put the method which print all student info in the same class and we need to do that
lets see how SRP solve that :

### After Apply SRP :


![SR1](https://github.com/ziadahmed123/SOLID-principles/assets/85025911/8601518e-7d85-4d94-a225-acce1359fbcd)



![SR](https://github.com/ziadahmed123/SOLID-principles/assets/85025911/f8297d9f-58bc-4411-9635-47097c7a5268)


After SRP we make the print student in anather class 
that will help us when we any class need modification we will modify it alone and dont need to modify the other class 




## 2- Open / Closed Principle
It means that classes are open for extension and closed for modification.
When we use this principle We should be able to add new functionality without touching the existing code for the class. This is because whenever we modify the existing code, we are taking the risk of creating potential bugs. So we should avoid touching the tested and reliable (mostly) production code if possible.



### For example :
### Before Open / closed :


![oc 5](https://github.com/ziadahmed123/SOLID-principles/assets/85025911/361e4716-4127-4585-9aba-e968732837a2)



so what if we have an update to add area of rectangle , we will update all the shape class .
is that good ?!.
sure it is not , open/closed principle help us to avoid that problem 
if we have an update we will make extension from the class and add the update.


### After Apply Open /Closed :

![OC1](https://github.com/ziadahmed123/SOLID-principles/assets/85025911/4e42d40c-287a-43ad-bc47-079fd809bfef)


![oc2](https://github.com/ziadahmed123/SOLID-principles/assets/85025911/9425e8ec-cc09-476e-8568-0737e54a58b4)



![oc3](https://github.com/ziadahmed123/SOLID-principles/assets/85025911/fb8e8e52-8b4d-485a-9fa0-aa4f5c4667e7)


Now we can handle any updates added to our programme easily .




