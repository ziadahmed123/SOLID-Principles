## Liskov Substitution Principle
### This principle means that every subclass or derived class should be substitutable for their base or parent class. in other words it means that if class A is a subtype of class B, we should be able to replace B with A without disrupting the behavior of our program.


### For example :
We make class vehicle that have 2 function (run - fly ) then we make subclass from that vehicle called 'car' .
Car can run put can't fly so LSP don't apply on that case because we cant replace car with the vehicle at that case .
the solution for that to make vehicle class have only function (run) and make sub calss from it for the classes that can fly  so that we can say that LSP apply on our code .
