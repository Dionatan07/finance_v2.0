package br.com.finance.finance.service;

import br.com.finance.finance.model.CardType;
import br.com.finance.finance.model.CreditCard;
import br.com.finance.finance.model.IssuingBank;
import org.springframework.stereotype.Service;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

@Service
public class CreditCardService {

    DateFormat f = DateFormat.getDateInstance();

    //Cria um mock para o ID;
    private final AtomicLong counter = new AtomicLong();

    //Gera logs no Console;
    private Logger looger = Logger.getLogger(CreditCardService.class.getName());

    public CreditCard findById(String id) {
        looger.info("Finding Credit Card by ID");
        CreditCard creditCard = new CreditCard();

        creditCard.setId(counter.incrementAndGet());
        creditCard.setCardType(new CardType(counter.incrementAndGet(), "Master Card"));
        creditCard.setIssuingBank(new IssuingBank(counter.incrementAndGet(), "Nubank"));
        creditCard.setCardIdentifier("Nubank");
        creditCard.setLimit(10000.0);
        creditCard.setClosingDate(new Date());
        creditCard.setDueDate(new Date());
        creditCard.setLastFourDigits(1504);
        creditCard.setCvv(141);
        creditCard.setExpirationDate(new Date());

        return creditCard;
    }


    private CreditCard mockPerson(int i) {

        CreditCard creditCard = new CreditCard();

        creditCard.setId(counter.incrementAndGet());
        creditCard.setCardType(new CardType(counter.incrementAndGet(), "Bandeira " + i));
        creditCard.setIssuingBank(new IssuingBank(counter.incrementAndGet(), "Emissor " + i));
        creditCard.setCardIdentifier("Cartão " + i);
        creditCard.setLimit(10000.0 * i);
        creditCard.setClosingDate(new Date());
        creditCard.setDueDate(new Date());
        creditCard.setLastFourDigits(1504 + i);
        creditCard.setCvv(141 + i);
        creditCard.setExpirationDate(new Date());

        return creditCard;
    }

    public List<CreditCard> findAll() {
        looger.info("Finding All Credit Cards");

        List<CreditCard> creditCards = new ArrayList<>();
        for (int i = 1; i <= 9; i++) {
            CreditCard creditCard = mockPerson(i);
            creditCards.add(creditCard);
        }
        return creditCards;
    }


}









