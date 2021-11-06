package pl.ppluta.carddatabase;

import pl.ppluta.creditcard.CardMemory;
import pl.ppluta.creditcard.CreditCard;

import java.util.Optional;

public class CardDatabase implements CardMemory {
    @Override
    public void save(CreditCard card) {

    }

    @Override
    public Optional<CreditCard> findByNumber(String s) {
        return Optional.empty();
    }
}
