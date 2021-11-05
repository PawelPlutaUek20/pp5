//package pl.ppluta.cardstorage;
//
//import org.junit.jupiter.api.Test;
//import pl.ppluta.creditcard.CreditCard;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//public class SqlCreditCardMemoryTest {
//    @Test
//    public void itStoreCard() {
//        SqlCreditCardMemory memory = new SqlCreditCardMemory();
//        CreditCard card = new CreditCard("123");
//
//        memory.save(card);
//
//        CreditCard loaded = memory.findByNumber("123")
//                .get();
//
//        assertEquals(card.getNumber(), loaded.getNumber());
//    }
//}
