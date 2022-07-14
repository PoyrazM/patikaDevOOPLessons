package Inheritance;

public abstract class Employee {
    private String fullName;
    private String phone;
    private String email;

    public Employee(String fullName,String phone,String email){
        this.fullName = fullName;
        this.phone = phone;
        this.email = email;
    }

    public String getFullName(){
        return this.fullName;
    }

    public void setFullName(String fullName){
        this.fullName = fullName;
    }

    public String getPhone(){
        return this.phone;
    }

    public void setPhone(String phone){
        this.phone = phone;
    }

    public String getEmail(){
        return this.email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public void enterSchool(){
        System.out.println(this.getFullName() + ":\t Entered the school");
    }
    public void enterSchool(String enterHour){
        System.out.println(this.getFullName()+": "+enterHour+" Entered this hour in the school");
    }

    public void enterSchool(String enterHour,String leftHour){
        System.out.println(this.getFullName()+": "+enterHour+" Entered this hour in the school and"+" "+leftHour+" Leaved this hour in the school");
    }

    public void leaveSchool(){
        System.out.println(this.getFullName() + ":\t Leaved the school");
    }

    public void enterDinnerHall(){
        System.out.println(this.getFullName() + ":\t Entered the dinner hall");
    }

    public static void  enterSchoolPersons(Employee[] persons){
        for (Employee e: persons) {
            e.enterSchool();
        }
    }

}
