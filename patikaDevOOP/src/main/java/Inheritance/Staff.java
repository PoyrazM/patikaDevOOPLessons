package Inheritance;

public class Staff extends Officer{
    private String document;
    public Staff(String fullName, String phone, String email, String officeDepartment, String shift,String document) {
        super(fullName, phone, email, officeDepartment, shift);
        this.document = document;
    }

    public String getDocument(){
        return this.document;
    }

    public void setDocument(String document){
        this.document = document;
    }

    public void watch(){
        System.out.println(this.getFullName()+":\t Watching school");
    }

    @Override
    public void workable(String jobBranch) {
        System.out.println(this.getFullName()+":\t Working "+jobBranch+" sector");
    }
}
