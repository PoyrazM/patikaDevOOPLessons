package Inheritance;

public class LabAssistant extends Assistant{
    public LabAssistant(String fullName, String phone, String email, String department, String title, String officeHours) {
        super(fullName, phone, email, department, title, officeHours);
    }

    public void enterLabLesson(){
        System.out.println(this.getFullName()+"\t Entered Lab Lessons");
    }

    public void enteredLesson(){
        System.out.println(this.getFullName()+"\t Entered Lessons");
    }
}
