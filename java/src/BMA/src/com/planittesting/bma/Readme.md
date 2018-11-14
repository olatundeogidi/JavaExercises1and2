# Java extended exercises

## Task 1

- Create an Employee Class that
  - Has the string attribute of fullName
  - Has the integer attribute of hours
  - Has the localdate attribute of startDate
  - create the appropriate getters and setters

- Create a Consultant class that extends the Employee class
  - Has the boolean attribute of assigned
  - the constructor will take Name and startDate as input
  - A method getDisplayText that returns a string in the form of "fullName , assigned, startDate"

- Create a BenchManager class that also extends Employee class
  - the constructor will take Name and startDate as input
  - A method getDisplayText that returns a string in the form of "fullName , startDate"

- Create a BenchManagerApplication class that implements iBenchManagerApplication

## Task 2

- Extend the Employee class to include address fields
  - the address fields should be held in their own class.
  - Modify the getDisplayText routines to include the newly created addresses