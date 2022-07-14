package Inheritance;

public abstract class Academician extends Employee{
    private String department;
    private String title;
    public Academician(String fullName, String phone, String email ,String department,String title) {
        super(fullName, phone, email);
        this.department = department;
        this.title = title;
    }

    public String getDepartment(){
        return this.department;
    }

    public void setDepartment(String department){
        this.department = department;
    }

    public String getTitle(){
        return this.title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public abstract void enterLesson(String lessonHour);
    /*
    {
        System.out.println(this.getFullName()+":\t Entered the class for lesson");
    }
    */
    @Override
    public void enterSchool(){
        System.out.println(this.getFullName()+":\t Academician entered the school from A block");
    }

}
