package pl.ppluta.creditcard;

import org.junit.jupiter.api.Assertions;
import  org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static  org.junit.jupiter.api.Assertions.*;

public class CreditCardTest {
    private Object CreditBelowLimitException;

    @Test
    public void itAllowsAssignCreditLimitToCard() {
        //Arrange
        CreditCard card = new CreditCard("1234-5678");
        //ACt
        card.assignCredit(BigDecimal.valueOf(1000));
        //Assert
        assertEquals(BigDecimal.valueOf(1000), card.getCurrentLimit());
    }

    @Test
    public void limitBelowThresholdCantBeAssigned() {
        CreditCard card = new CreditCard("1234-5678");
        card.assignCredit(BigDecimal.valueOf(50));
        Assertions.fail("Exception should be thrown");
    }

    @Test
    public void randomFunction() {
        CreditCard card = new CreditCard("1234-5678");
        card.assignCredit(BigDecimal.valueOf(1000));
        card.withdraw(BigDecimal.valueOf(500));
        assertEquals(BigDecimal.valueOf(500), card.getBalance());
    }
}
