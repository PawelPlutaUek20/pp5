package pl.ppluta.creditcard;

import com.sun.xml.internal.ws.api.message.ExceptionHasMessage;

import java.math.BigDecimal;

public class CreditCard {
    private final String cardNumber;
    private BigDecimal creditLimit;
    private BigDecimal balance;

    public CreditCard(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public void assignCredit(BigDecimal creditLimit) {
        if (isBelowCreditLimit(creditLimit)) {
            throw new IllegalStateException();
        }
        this.creditLimit = creditLimit;
    }

    private boolean isBelowCreditLimit(BigDecimal creditLimit) {
        return creditLimit.compareTo(BigDecimal.valueOf(100)) < 0;
    }


    public BigDecimal getCurrentLimit() {
        return creditLimit;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void withdraw(BigDecimal money) {
        if (balance.compareTo(money) < 0) {
            throw new IllegalStateException();
        }
        this.balance = balance.subtract(money);
    }
}
