package rocks.zipcode.quiz4.objectorientation.account;

/**
 * @author leon on 30/12/2018.
 */
public class Employee implements Worker,Transactable{
    BankAccount account = new BankAccount();
    Double wage =35.0;
    Double hoursworked=0.0;


    public Employee() {
    }

    public Employee(BankAccount bankAccount) {
        this.account = bankAccount;
    }

    public BankAccount getBankAccount() {

        account.setBalance(0.0);

        return account;
    }

    public void setBankAccount(BankAccount bankAccount) {

        this.account=bankAccount;

    }

    @Override
    public void increaseHoursWorked(Double numberOfHours) {

    }

    @Override
    public Double getHoursWorked() {
        return hoursworked;
    }

    @Override
    public Double getHourlyWage() {
        return wage;
    }

    @Override
    public Double getMoneyEarned() {
        return null;
    }

    @Override
    public void deposit(Double amountToIncreaseBy) {
        account.setBalance(account.getBalance()+amountToIncreaseBy);
    }

    @Override
    public void withdrawal(Double amountToDecreaseBy) {
        account.setBalance(account.getBalance()-amountToDecreaseBy);

    }

    @Override
    public Double getBalance() {
        return account.getBalance();
    }
}
