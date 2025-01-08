package week5;

public class CashRegister {
    private double cashInRegister;   // the amount of cash in the register
    private int economicalSold;      // the amount of economical lunches sold
    private int gourmetSold;         // the amount of gourmet lunches sold

    public CashRegister() {
        this.cashInRegister = 1000;
        // at start the register has 1000 euros
    }

    public double payEconomical(double cashGiven) {
        double economicalLunch = 2.5;
        if (cashGiven >= economicalLunch) {
            cashInRegister += economicalLunch;
            economicalSold++;
            return (cashGiven - economicalLunch);
        } else {
            return cashGiven;
        }
        // the price of the economical lunch is 2.50 euros
        // if the given cash is at least the price of the lunch:
        //    the price of lunch is added to register
        //    the amount of the sold lunches is incremented by one
        //    the method returns cashGiven - lunch price
        // if not enough money is given, all is returned and nothing else happens
    }

    public double payGourmet(double cashGiven) {
        double gourmetLunch = 4;
        if (cashGiven >= gourmetLunch) {
            cashInRegister += gourmetLunch;
            gourmetSold++;
            return (cashGiven - gourmetLunch);
        } else {
            return cashGiven;
        }
        // the price of the gourmet lunch is 4.00 euros
        // if the given cash is at least the price of the lunch:
        //    the price of lunch is added to the register
        //    the amount of the sold lunches is incremented by one
        //    the method returns cashGiven - lunch price
        // if not enough money is given, all is returned and nothing else happens
    }

    public boolean payEconomical(LyyraCard card) {
        double economicalLunch = 2.5;
        if (card.balance() >= economicalLunch) {
            card.pay(economicalLunch);
            economicalSold++;
            return true;
        } else {
            return false;
        }
        // the price of the economical lunch is 2.50 euros
        // if the balance of the card is at least the price of the lunch:
        //    the amount of sold lunches is incremented by one
        //    the method returns true
        // if not, the method returns false
    }

    public boolean payGourmet(LyyraCard card) {
        double gourmetlLunch = 4.0;
        if (card.balance() >= gourmetlLunch) {
            card.pay(gourmetlLunch);
            gourmetSold++;
            return true;
        } else {
            return false;
        }
        // the price of the gourmet lunch is 4.00 euros
        // if the balance of the card is at least the price of the lunch:
        //    the amount of sold lunches is incremented by one
        //    the method returns true
        // if not, the method returns false
    }

    public void loadMoneyToCard(LyyraCard card, double sum) {
        card.loadMoney(sum);
        cashInRegister += sum;
    }

    public String toString() {
        return "money in register "+cashInRegister+" economical lunches sold: "+economicalSold+" gourmet lunches sold: "+gourmetSold;
    }
}
