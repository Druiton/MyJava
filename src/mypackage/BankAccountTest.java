package mypackage;

public class BankAccountTest {

    public static void main(String[] args) {
        BankAccount MyAccount = new BankAccount();
        BankAccount YourAccount = new BankAccount();
        BankAccount HisAccount = new BankAccount();

        MyAccount.id = 1;
        MyAccount.name = "Maxim";
        MyAccount.balance = 10991.111;

        YourAccount.id = 2;
        YourAccount.name = "Denis";
        YourAccount.balance = 12.311;

        HisAccount.id = 3;
        HisAccount.name = "Kostya";
        HisAccount.balance = 31.131;

        System.out.println(YourAccount.name);
    }
}
