package Interface;

public class BankA implements IBank{
    private String bankName;
    private String terminalID;
    private String password;

    public BankA(String bankName,String terminalID,String password){
        this.bankName = bankName;
        this.terminalID = terminalID;
        this.password = password;
    }

    public String getBankName(){
        return this.bankName;
    }

    public void setBankName(String bankName){
        this.bankName = bankName;
    }

    public String getTerminalID(){
        return this.terminalID;
    }

    public void setTerminalID(String terminalID){
        this.terminalID = terminalID;
    }

    public String getPassword(){
        return this.password;
    }

    public void setPassword(String password){
        this.password = password;
    }

    @Override
    public boolean connect(String ipAddress) {
        System.out.println("User's ip :"+ipAddress);
        System.out.println("Machine's ip :" + this.hostIpAddress);
        System.out.println(this.getBankName()+ ":\tConnected !");
        return true;
    }

    @Override
    public boolean payment(double price, String cardNumber, String expiryDate, String cvc){
        System.out.println("Waiting answer from Bank" + this.getBankName() + "...");
        System.out.println("The transaction was successful.");
        return true;
    }

}
