package week5;

public class LyyraCard {
    private double balance;

    public LyyraCard(double balance) {
        this.balance = balance;
    }

    public double balance() {
        return this.balance;
    }

    public void loadMoney(double amount) {
        this.balance += amount;

    }

    public boolean pay(double amount){
        if (this.balance > amount) {
            loadMoney(-amount);
            return true;
        } else {
            return false;
        }
        // the method checks if the balance of the card is at least the amount given as parameter
        // if not, the method returns false meaning that the card could not be used for the payment
        // if the balance is enough, the given amount is taken from the balance and true is returned
    }
}