package org.gscomptech;

public class HDFCBank extends CommonBank {
    @Override
    public double calculateInterest(int amount) {
        return 8.0*amount/100;
    }
}
