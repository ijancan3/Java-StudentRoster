# Java-StudentRoster
Java port of a C++ program submitted for evaluation for the Scripting And Programming Applications course.

Things I learned while creating this port:
	
	1) How to create separate class objects that perform the necessary tasks, while keeping the main() method modular and clutter free.
	2) How to create default object constructors as well as use constructor parameters to initialize objects.
	3) How to use ArrayLists to store objects, and then modify and delete them.
	4) How to use the printf() method to format the output.
	5) How to use the split() method to separate a comma delimited string into individual string values.
	6) How to search through an ArrayList for string values and perform logical operations if the matching value is/not found.

Overall, I feel that the Java version of this program was much easier to create due to not having to worry about memory management. The original C++ program required the use of an array of pointers to store references to objects created in the Roster method. I found the Java string methods much easier to work with, especially when I could just use a string for the degreeProgram, instead of using an enumerated type, which was required in the C++ course. 

The original requirements for the program are:
	
	1) That the program maintains a current roster of students within a given course, and the entire student list is stored in an array of students called classRosterArray. 
	2) The raw data is passed in a comma delimited string (studentData), and the program is to parse the string at startup, create the Student objects, and store them in the classRosterArray.
	3) The Student object must contain getter and mutator functions for each value within, as well as a print() function that displays all of the data for each object.
	4) 
