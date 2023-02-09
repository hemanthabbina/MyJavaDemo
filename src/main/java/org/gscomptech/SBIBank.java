package org.gscomptech;

public class SBIBank extends CommonBank {
    @Override
    public double calculateInterest(int amount) {
        return 7.0*amount/100;
    }
}
