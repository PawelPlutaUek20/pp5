package pl.ppluta.creditcard;

import java.math.BigDecimal;

public class BankingSystem {

    private final CreditCardPermanentMemory memory;

    public BankingSystem(CreditCardPermanentMemory memory) {
        this.memory = memory;
    }

    public void handleWithdraw(String cardNumber, int money) {
        CreditCard card = memory.findByNumber(cardNumber).get();
        card.withdraw(BigDecimal.valueOf(money));

        memory.save(card);
    }
}
