package pl.ppluta.creditcard;

import org.junit.jupiter.api.Test;

public class BlablaTest {
    @Test
    public void itAllowsToHandleCreditCardWithdrawFromMultipleCards() {
        String cardNumber1 = thereIsCardWithLimitInTheSystem(1000);
        String cardNumber2 = thereIsCardWithLimitInTheSystem(2000);

        BankingSystem system = thereIsBnakingSystem();

        system.handleWithdraw(cardNumber1, 500);
        system.handleWithdraw(cardNumber2, 1000);

        balanceOfCardEquals(cardNumber1, 500);
        balanceOfCardEquals(cardNumber2, 1000);
    }

    private BankingSystem thereIsBnakingSystem() {
        return new BankingSystem();
    }

    private void balanceOfCardEquals(String cardNumber2, int i) {
    }

    private String thereIsCardWithLimitInTheSystem(int i) {
        return "123456";
    }
}
