package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Account bobsAccount = new Account();

        bobsAccount.setNumber("12345");
        bobsAccount.setBalance(1000.00);
        bobsAccount.setCustomerName("Bob Brown");
        bobsAccount.setCustomerEmail("myemail@bob.com");
        bobsAccount.setCustomerPhone("(087) 123-4567");

        bobsAccount.withdrawFunds(100.0);
        bobsAccount.depositFundsInfo(250);
        bobsAccount.withdrawFunds(50);

        bobsAccount.withdrawFunds(200);

        bobsAccount.depositFundsInfo(100);
        bobsAccount.withdrawFunds(45.55);
        bobsAccount.withdrawFunds(54.46);

        bobsAccount.withdrawFunds(54.45);

    }
}