package org.gscomptech;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

      //  System.out.println(calculateInterest("SBI", 1000));
      //  System.out.println(calculateInterest("ICICI", 1000));

        System.out.println(calculateInterest("SBI", 1000));

    }
    // amount * rate/100
    public static double calculateInterest(String bankName, int amount) {
        if (bankName.equals("SBI")) {
            return 7.0*amount/100;
        } else if (bankName.equals("ICICI")) {
            return 8.0*amount/100;
        } else if (bankName.equals("HDFC")) {
            return 9.0*amount/100;
        }
        return 0;
    }

    public static double calculateInterest2(String bankName, int amount) {
        CommonBank bank = null;
        if(bankName.equals("SBI")) {
            bank = new SBIBank();
        } else if (bankName.equals("HDFC")) {
            bank = new HDFCBank();
        }

        bank.sayHello();

        calculate(bank, amount);
        return 0;
    }

    private static double calculate(CommonBank bank, int amount) {
        if(bank != null)
            return bank.calculateInterest(1000);
        return 0;
    }
}