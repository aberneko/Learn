package OOP.Encapsulation;

public class tack {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.setMoneyAmount(1000); // передайте в банкомат сумму на счету
        System.out.println("Количество денег на счету - " + bankAccount.getMoneyAmount() + " р.");
        bankAccount.AllPrime(); // вызовите метод вывода средств
        System.out.println("Количество денег на счету - " + bankAccount.getMoneyAmount() + " р.");
    }
}

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