package Inheritance;

public class Lecturer extends Academician {
    private int doorNumber;

    public Lecturer(String fullName, String phone, String email, String department, String title, int doorNumber) {
        super(fullName, phone, email, department, title);
        this.doorNumber = doorNumber;
    }

    public int getDoorNumber() {
        return this.doorNumber;
    }

    public void setDoorNumber(int doorNumber) {
        this.doorNumber = doorNumber;
    }

    @Override
    public void enterLesson(String lessonHour) {
        System.out.println(this.getFullName() +":\t Lecturer entered lesson " +lessonHour+ " AM ");
    }

    @Override
    public void enterSchool(){
        System.out.println(this.getFullName()+":\t Lecturer entered the school from B block");
    }

}
