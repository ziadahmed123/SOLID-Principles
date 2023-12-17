## Open / Closed Principle
### It means that classes are open for extension and closed for modification. When we use this principle We should be able to add new functionality without touching the existing code for the class. This is because whenever we modify the existing code, we are taking the risk of creating potential bugs. So we should avoid touching the tested and reliable (mostly) production code if possible.


## For example : 
if we want to calculate the area of circle and rectangle so it is easy we can make a function that take input from user and then calculate the area .
what if we want to add anather shape to calculate its area ? 
is is good to modify the function with anather else if ? 
it is a bad solution .
OCP tells us that should make classes open for extension and closed for modification . 
so we can make a good solution by making interface class called shape , make the classes that we want to calculate it's area extend behaviour from shape .
if we have new class to calculate it is area so add a new class.
that will make your project more maintainable and flexible . 
