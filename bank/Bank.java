package bank;

class Account{
    public String name;
    protected String email;
    private String password;
    //getter & setter 
    public String getPassword(){
        return this.password;
    }
    private void setPassword(String pass){
        this.password = pass;
    }

}
public class Bank {
    public static void main(String[] args){
        Account acc1 = new Account();
        acc1.name = "Raamu dai";
        // acc1.email = "raamudai213@gmail.com";
        acc1.setPassword("raamu@123");
        System.out.println(acc1.getPassword());
    }
}