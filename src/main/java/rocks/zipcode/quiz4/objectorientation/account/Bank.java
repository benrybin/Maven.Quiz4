package rocks.zipcode.quiz4.objectorientation.account;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 27/12/2018.
 */
public class Bank {


    public List<BankAccount> getMain() {
        return this.main;
    }

    public void setMain(List<BankAccount> main) {
        this.main = main;
    }

    List<BankAccount> main = new ArrayList<>();

    public  void removeBankAccountByIndex(Integer indexNumber) {
        System.out.println(getMain().size());
        this.getMain().remove(indexNumber);
        System.out.println(getMain().size());



    }

    public void addBankAccount(BankAccount bankAccount) {
        this.getMain().add(bankAccount);

    }

    public Boolean containsBankAccount(BankAccount bankAccount) {
        return this.getMain().contains(bankAccount);
    }
}
