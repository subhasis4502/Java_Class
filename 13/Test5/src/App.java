class lowBalanceException extends Exception {
    long amount;
    lowBalanceException(long amount){
        this.amount = amount;
    }
}

class excessBalanceException extends Exception {
    long amount;
    excessBalanceException(long amount){
        this.amount = amount;
    }
}

class Bank {
    static long maxBalance = 35000;
    public void withdraw( long accNum, long amount) throws lowBalanceException, excessBalanceException{

        long balance = getBalance(accNum);

        if(balance < amount){
            throw new lowBalanceException(amount);
        }

        if(amount > maxBalance){
            throw new excessBalanceException(amount);
        }

        else
            System.out.println("Balance withdrawn");
    }

    private long getBalance(long accNum){
        return 50000;
    }
}

public class App {
    public static void main(String[] args) {
        Bank u1 = new Bank();
        try{
            u1.withdraw(11111111, 40000);
        }
        catch(lowBalanceException le){
			System.out.println("Low Balance exception thrown");
		}
		catch(excessBalanceException ee){
			System.out.println("Excess Balance exception thrown"); //op 
		}
    }
}