# Java-StudentRoster
Java port of a C++ program submitted for evaluation for the Scripting And Programming Applications course. Due to academic integrity concerns, the original program in C++ will NOT be posted or provided.

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
	3) The Student class must contain getter and mutator functions for each value within, as well as a print() function that displays all of the data for each Student object.
	4) The Roster class must contain an array of pointers, classRosterArray, to hold the data provided in the studentData string (this was changed to an ArrayList in Java).
	5) The Roster class must have an add() function, which takes input values for each field in the studentData string, and creates a Student object, and then adds it to the classRosterArray.
	6) The Roster class must contain a remove() function that removes students from the roster by student ID. If the student ID does not exist, the function prints an error message indicating that the student was not found.
	7) The Roster class must contain a printAll() function that prints a complete list of student data. This was another change made intentionally, as the original project called for a tab separated list on one line, whereas I decided to use the printf() method to create blocks of student data.
	8) The roster class must contain a printAverageDaysInCourse(string studentID) that correctly prints a student’s average number of days in the three courses. The student is identified by the studentID parameter. I used a callAvgDays() method to pass an ID for each student into the printAverageDays() method, thereby printing all of them.
	9) The Roster class must contain a printInvalidEmails() that verifies student email addresses and displays all invalid email addresses to the user. A valid email should include an "@" sign, and a ".", and should not include a space.
	10) The Roster class must contain a printByDegreeProgram() method that prints out student information for a degree program specified by an enumerated type. I used a callDegreePrint() method which passed each of the degree programs into the printByDegreeProgram() function. I decided to use a tempStudent object instead of making the degreeProgram variable a global one, but I suppose either one could work. 

Overall, the original implementation was more complicated than the current iteration, but it did receive an excellence award from WGU. It was my first functional program in C++, and I am very proud of the port to Java as well. I will continue to draw from concepts learned in this program in the future.
