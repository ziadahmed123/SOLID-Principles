## Interface Segregation Principle
###it simply means that larger interfaces should be split into smaller ones. By doing so, we can ensure that implementing classes only need to be concerned about the methods that are of interest to them.

for example :
in our case we make an inferface class (plane)  that have 3 functions (fly - lauch_rockets -Acrobatic_movements),
then we make sub calss (travel plane )  which implements plane .
We inforced travel_plane to implement these 3 fuctions .
is travel plane will launch rocket ?!
is travel plane should do Acrobaticmovements ?!
so we implement 2 unneccessar functions .
ISP solve that problem it simply means that larger interfaces should be split into smaller ones.
