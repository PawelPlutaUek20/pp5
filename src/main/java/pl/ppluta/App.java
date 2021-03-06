package pl.ppluta;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import pl.ppluta.creditcard.CardApi;
import pl.ppluta.creditcard.CreditCardMemory;

@SpringBootApplication
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World");
        SpringApplication.run(App.class, args);
    }

    @Bean
    CardApi createBankingSystem() {
        return new CardApi((new CreditCardMemory()));
    }
}
