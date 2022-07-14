package Inheritance;

public class Assistant extends Academician{
    private String officeHours;
    public Assistant(String fullName, String phone, String email, String department, String title,String officeHours) {
        super(fullName, phone, email, department, title);
        this.officeHours = officeHours;
    }

    public String getOfficeHours(){
        return this.officeHours;
    }

    public void setOfficeHours(String officeHours){
        this.officeHours = officeHours;
    }

    public void doQuiz(){
        System.out.println(this.getFullName()+":\t Do Quiz today");
    }

    @Override
    public void enterLesson(String lessonHour) {

    }
}
