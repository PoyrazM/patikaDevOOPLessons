package Inheritance;

public class InformationTechnology extends Officer{
    private String mission;
    public InformationTechnology(String fullName, String phone, String email, String officeDepartment, String shift,String mission) {
        super(fullName, phone, email, officeDepartment, shift);
        this.mission = mission;
    }

    public String getMission(){
        return this.mission;
    }

    public void setMission(String mission){
        this.mission = mission;
    }

    public void setupNetwork(){
        System.out.println(this.getFullName()+":\t Setup Networking");
    }

    @Override
    public void workable(String jobBranch) {
        System.out.println(this.getFullName()+":\t Working "+jobBranch+" branch");
    }
}
