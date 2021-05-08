import java.util.ArrayList;
public class Roster {
    private final String[] studentData = 
                {"A1,John,Smith,John1989@gm ail.com,20,30,35,40,SECURITY", 
		"A2,Suzan,Erickson,Erickson_1990@gmailcom,19,50,30,40,NETWORK",
		"A3,Jack,Napoli,The_lawyer99yahoo.com,19,20,40,33,SOFTWARE",
		"A4,Erin,Black,Erin.black@comcast.net,22,50,58,40,SECURITY", 
		"A5,John,Jacobs,jjacobs@wgu.edu,35,30,45,45,SOFTWARE"};
    
    int objects = 0;
    ArrayList<Student> classRosterArray = new ArrayList<>();
    
    public void parseStudentData(String studentData){
        
        
            String[] values = studentData.split(","); //Takes the comma delimited string passed as studentData and sets each value before a comma as its own variable
            add(values[0], values[1], values[2], values[3], Integer.valueOf(values[4]),Integer.valueOf(values[5]), Integer.valueOf(values[6]), Integer.valueOf(values[7]), values[8]);
            //Calls the add() function below and converts the string values of days into integers
    }
    public void add(String studentID, String firstName, String lastName, String email, int age, int course1, int course2, int course3, String degProg){
        int[] days = {course1, course2, course3};
        Student someStudent = new Student(studentID, firstName, lastName, email, age, days, degProg); //calls the constructor
        this.classRosterArray.add(someStudent); //adds the Student objects into the class roster array
    }
    
    public void remove(String studentID){
        System.out.println("Removing "+ studentID);
        boolean found = false;
        Student someStudent;
        for(int i=0; i<this.classRosterArray.size(); ++i){
            someStudent = this.classRosterArray.get(i);
            if(someStudent.getStudentID().equals(studentID)){
                this.classRosterArray.set(i,new Student());
                found=true;
            }
        }
        if(!found){
            System.out.println("Student with ID: "+studentID+" not found!");
        }
    }
    
    public void printAll(){
        for(Student datum: classRosterArray){
            if(!datum.getStudentID().equals("")){
                datum.print();
            }
        }
    }
    
    public void callAvgDays(){
        for(Student datum: this.classRosterArray){
            printAverageDays(datum.getStudentID());
        }
    }
    public void printAverageDays(String studentID){
        double averageDays;
        int sum = 0;
        boolean isThere = false;
        ArrayList<Integer> days = new ArrayList<>();
        String id;
        for(Student datum:this.classRosterArray){
            id = datum.getStudentID();
            if(id.equalsIgnoreCase(studentID)){
                days = datum.getDays();
                for(int day: days){
                    sum +=day;
                }
                averageDays = 1.0 * sum / days.size();
                System.out.println("Student with ID number: "+ studentID + " took an average of "+ averageDays + " days to complete a course.");
                isThere = true;
            }
        }
        if(!isThere){
            System.out.println("Student with ID number: "+studentID+" not found.");
        }
    }
    public void printInvalidEmails(){
        System.out.println("The following emails are invalid: ");
        boolean allValid = false;
        for(Student datum:this.classRosterArray){
            
            String email = datum.getEmail();
            if(email.contains(" ")||!email.contains(".")||!email.contains("@")){
                System.out.println(email);
                allValid = true;
            }
        }
        if(!allValid){
            System.out.println("No invalid emails found!");
        }
    }
    public void printByDegreeProgram(String degreeProg){
        for(Student datum:this.classRosterArray){
            if(datum.getDegreeProgram().equals(degreeProg)){
                datum.print();
            }
        }
    }
    public void callParser(){
        for(int i = 0; i<5; ++i){
            parseStudentData(this.studentData[i]); //splits the student data array into individual strings and passes them to the parse function to create the student objects
        }
    }
    public void callDegreePrint(){ //prints all of the students in the class by degree program
        System.out.println("\nPrinting students by degree progam: ");
        Student tempStudent = new Student(); //since Degree program is not a global variable like the enumerated type Degree in C++, this creates a temporary student object and retreives the degree programs stored within
        String[] degrees = tempStudent.returnDegreeProgram();
        for(int i=0; i<3; ++i){
            printByDegreeProgram(degrees[i]);
        }
    }
}
