Home work 3 tasks.
-----------------------

 1. Employees
-----------------------
   Create class hierarchy Employees.
   There should be 3 types of employees: Manager, Programmer, Accountant.
   All of employees must implement interface Employee.
   Every employee should be able to:

	1) set salary
	2) work specified amount of hours
	3) calculate current month salary
	4) get ratio of worked hours

Each employee should work **160** hours per month to get 100% of salary.
Employees salary depends on worked hours.
Programmers salary is directly proportional to the number of worked hours.
Accountant and Manager are the same, but get only 100% of salary in case of overtimes.

Examples:

	Programmer with salary 100$ worked 80 hours -> salary 50$
	Programmer with salary 100$ worked 320 hours -> salary 200$
	Accountant and Manager with salary 100$ worked 80 hours -> salary 50$
	Accountant and Manager with salary 100$ worked 320 hours -> salary 100$

Accountant should be able to calculate overall salary for all accountable employees (including himself).
Accountant must implement interface Accountant.

There is utility class EmployeesFactory which should create instances of different employee types with given salary.
Implement factory methods for all employee types.

 2. Container
-----------------------
Implement container based on array to store numbers.
There should be should be following methods:

	  1) get container size
	  2) clear all container
	  3) add element to the end
	  4) get element at specified position
	  5) add element to specified position
	  6) remove element at specified position

You should implement all methods for ContainerImpl.
Initial array size is **10** and it's specified in Container interface.
