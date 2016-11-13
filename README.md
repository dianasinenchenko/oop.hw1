OOP. Home Work 1
=======================

1 Extended Integer 
------------------
Implement all methods for ExtendedInteger class. The class contains:</br>

1) An int data field named value that stores the int value reprinted by this object.</br> 
2) A constructor that creates a ExtendedInteger object for the specified int value. </br>
3) A get method that returns the int value. </br>
4) Methods isEven(), isOdd(), and isPrime() that return true if the value is even, odd, or prime respectively.</br> 
5) Static methods isEven(int), isOdd(int), and isPrime(int) that return true if the specified value is even, odd, or prime respectively.</br> 
6) Static methods isEven(ExtendedInteger), isOdd(ExtendedInteger), and isPrime(ExtendedInteger) that return true if the specified value is even, odd, or prime respectively.</br> 
7) Methods equals(int) and equals(Object) that return true if the value in the object is equal to the specified value. </br>
8) A static method parseInt(char\[\]) that converts an array of numeric characters to an int value. </br>
9) A static method parseInt(String) that converts a string to an int value.</br>

2 Vehicles 
----------
Implement Vehicle class hierarchy. There should be the following:</br> 

1) Parent Class: Vehicle. </br>
This abstract parent class has private instance variables, mutator methods, accessor methods, and constructor parameters for: Year manufactured; Make; Model.</br>
2) Child Classes: Car, Boat, Airplane. </br>
Class Vehicle has child classes which have additional private instance variables, mutator methods, accessor methods, and constructor parameters for:
```
    Car has "int horsepower"; 
    Boat has "boolean motorized"; 
    Airplane has "int maximumHeightFeet".
```
3) Each of the Car, Boat, and Airplane classes must override the equals() and toString() methods.
```
    Methods equals(): 
        Cars are equal if their horsepower is within 10 of one another. 
        Boats are equal if they are both motorized, or both unmotorized. 
        Airplanes are equal if their maximumHeightFeet is within 1000 of one another.         
    The toString methods must return a String in these formats: 
        This car is a 1999 Toyota Corrola with 140 hp. 
        This boat is a 1980 Bayliner Extreme (with motor). 
        This airplane is a 1998 ABC Motors Comac that can reach 10000 feet.
```
4) Implementing Steerable Interface. 
```
    Each of the Car, Boat, and Airplane classes must implement the Steerable interface. 
    This interface has methods to accelerate(), steerLeft(), and steerRight().   
        Methods accelerate():
            Cars that accelerate simply return "fire pistons, turn wheels"; 
            Boats that accelerate simply return "jet water";
            Airplanes that accelerate simply return "fire engines on wings".
        Methods steerLeft():
            Cars that steer left simply return "turn wheels left";
            Boats that steer left simply return "turn tiller left"; 
            Airplanes that steer left simply return "lift wing flaps to turn left".
        Methods steerRight():
            Cars that steer right simply return "turn wheels right"; 
            Boats that steer right simply return "turn tiller right"; 
            Airplanes that steer right simply return "lift wing flaps to turn right".
```


3 Employees
-----------
Create class hierarchy Employees.
There should be 3 types of employees: Manager, Programmer, Accountant.
All of employees must implement interface Employee.
Every employee should be able to:
```
1) set salary
2) work specified amount of hours
3) calculate current month salary
4) get ratio of worked hours
```
Each employee should work **160** hours per month to get 100% of salary.
Employees salary depends on worked hours.
Programmers salary is directly proportional to the number of worked hours.
Accountant and Manager are the same, but get only 100% of salary in case of overtimes.

###### Examples:
```
Programmer with salary 100$ worked 80 hours -> salary 50$
Programmer with salary 100$ worked 320 hours -> salary 200$
Accountant and Manager with salary 100$ worked 80 hours -> salary 50$
Accountant and Manager with salary 100$ worked 320 hours -> salary 100$
```
Accountant should be able to calculate overall salary for all accountable employees (including himself).
Accountant must implement interface Accountant.

There is utility class EmployeesFactory which should create instances of different employee types with given salary.
Implement factory methods for all employee types.

4 Container
-----------
Implement container based on array to store numbers.
There should be should be following methods:
```
1) get container size
2) clear all container
3) add element to the end
4) get element at specified position
5) add element to specified position
6) remove element at specified position
```
You should implement all methods for ContainerImpl.
Initial array size is **10** and it's specified in Container interface.
