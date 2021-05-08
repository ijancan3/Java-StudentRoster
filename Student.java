import java.util.ArrayList;
public class Student {
    private String studentID;
    private String firstName, lastName, email;
    private int age;
    String degProg;
    private ArrayList<Integer> days = new ArrayList<>();
    private final String degreeProgram[] = {"SECURITY", "NETWORK", "SOFTWARE"};
    
    
    Student(){
        this.studentID = ""; 
        this.firstName="";
        this.lastName = "";
        this.email="";
        this.age=0;
        this.degProg = degreeProgram[1];
        
        for(int i=0; i<3; ++i){
            this.days.add(i, 0);
        }
    }
    
    Student(String id, String firstName, String lastName, String email, int age, int[] days, String degreeProg){ 
        this.studentID = id;
        this.firstName=firstName;
        this.lastName = lastName;
        this.email = email;
        this.age=age;
        
        for(int i = 0; i<3; i++){
            this.days.add(days[i]);
            if(degreeProg.equalsIgnoreCase(this.degreeProgram[i])){
                this.degProg = this.degreeProgram[i];
            }
        }
        
        
        
    }
    public void setDegreeProgram(String degProg){
        for(int i=0; i<3; ++i){
            if(degProg.equalsIgnoreCase(this.degreeProgram[i])){
                this.degProg = this.degreeProgram[i];
            }
        }
    }
    
    public void print(){
        String format = "%-20s%s%n"; //variable for fomat output that indents twenty spaces and inserts a line end character
        String msg = "";
        System.out.printf(format,"\tID: "+ this.studentID,msg);
        System.out.printf(format,"\tFirst Name: "+this.firstName,msg);
        System.out.printf(format,"\tLastName: "+this.lastName,msg);
        
        System.out.printf(format,"\tEmail: "+ this.email,msg);
        System.out.printf(format,"\tAge: "+this.age,msg);
        System.out.printf(format,"\tDays in course: {"+getDays().get(0)+","+getDays().get(1)+","+getDays().get(2)+"}",msg);
        System.out.printf(format,"\tDegree Program: "+this.degProg,msg);
        System.out.printf(format,"\t================",msg);
        
    }
    
    public void setStudentId(String id){
        this.studentID = id;
    }
    
    public void setFirstName(String fName){
        this.firstName = fName;
    }
    public void setLastName(String lName){
        this.lastName= lName;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setDays(int[] days){
        for(int i=0; i<3; ++i){
            this.days.add(days[i]);
        }
    }
    public String getStudentID(){
        return this.studentID;
    }
    public String getFirstName(){
        return this.firstName;
    }
    public String getLastName(){
        return this.lastName;
    }
    public String getEmail(){
        return this.email;
    }
    public int getAge(){
        return this.age;
    }
    public ArrayList<Integer> getDays(){
        return this.days;
    }
    public String getDegreeProgram(){
        return this.degProg;
    }
    
   public String[] returnDegreeProgram(){
        String[] degreeProgram={"","",""};
        for(int i=0; i<3; ++i){
            degreeProgram[i] = this.degreeProgram[i];
        }
        return degreeProgram;
    }
}
