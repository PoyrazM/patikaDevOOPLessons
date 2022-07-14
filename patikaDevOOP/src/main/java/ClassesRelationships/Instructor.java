package ClassesRelationships;

public class Instructor {
    private String name;
    private String lastName;
    private String department;

    public Instructor(String name , String lastName , String department){
        this.name = name;
        this.lastName = lastName;
        this.department = department;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getLastName(){
        return this.lastName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public String getDepartment(){
        return this.department;
    }

    public void setDepartment(String department){
        this.department = department;
    }


}
