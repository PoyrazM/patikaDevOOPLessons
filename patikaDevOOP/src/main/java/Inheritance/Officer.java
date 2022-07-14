package Inheritance;

public abstract class Officer extends Employee{
    private String officeDepartment;
    private String shift;
    public Officer(String fullName, String phone, String email,String officeDepartment,String shift) {
        super(fullName, phone, email);
        this.officeDepartment = officeDepartment;
        this.shift = shift;
    }

    public String getOfficeDepartment(){
        return this.officeDepartment;
    }

    public void setOfficeDepartment(String officeDepartment){
        this.officeDepartment = officeDepartment;
    }

    public String getShift(){
        return this.shift;
    }

    public void setShift(String shift){
        this.shift = shift;
    }

    public abstract void workable(String jobBranch);
    /*
    {
        System.out.println(this.getFullName()+ ":\t Officer is doing his/her works");
    }
    */
    @Override
    public void enterSchool(){
        System.out.println(this.getFullName()+":\t Officer entered the school from C block");
    }
}
