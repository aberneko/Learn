package com.aberneko.learning.OOP.Encapsulation.TackEncapsulationOne;

class BankAccount {
    private long moneyAmount;

    public void setMoneyAmount(long newMoneyAmount) {
        moneyAmount = newMoneyAmount;
    }

    public long getMoneyAmount() {
        return moneyAmount;
    }
    public void AllPrime() {
        long allprime = moneyAmount;
        moneyAmount = 0;
        System.out.println("Вы сняли " + allprime);
    }


}