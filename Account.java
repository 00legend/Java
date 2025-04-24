public class Account {
    long acct_no;
    double balance;
    String name;

    Account(){
        acct_no=1235774840;
        this.balance=50000;
        this.name="itsme";
    }



    public static void main(String[] args) {
        Account ac = new Account();

        System.out.println("my acocunt number is "+ac.acct_no+"and is valid");
        System.out.println("BALANCE"+ac.balance);
        System.out.println("account holder name"+ac.name);
    }
}