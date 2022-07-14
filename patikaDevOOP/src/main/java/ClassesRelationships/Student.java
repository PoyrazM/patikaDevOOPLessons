package ClassesRelationships;

public class Student {
    private String name;
    private String lastName;
    private int id;
    private String address;
    private int grade;

    public Student(String name , String lastName , int id , String address , int grade){
        this.name = name;
        this.lastName = lastName;
        this.id = id;
        this.address = address;
        if (grade<0 || grade>100){
            grade = 0;
        }
        this.grade = grade;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getGrade(){
        return this.grade;
    }

    public void setGrade(int grade){
        if (grade<0 || grade>100){
            grade = 0;
        }
        this.grade = grade;
    }
}
