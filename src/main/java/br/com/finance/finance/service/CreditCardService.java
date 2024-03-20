package br.com.finance.finance.service;

import br.com.finance.finance.model.CardType;
import br.com.finance.finance.model.CreditCard;
import br.com.finance.finance.model.IssuingBank;
import org.springframework.stereotype.Service;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

@Service
public class CreditCardService{

    DateFormat f = DateFormat.getDateInstance();

    //Cria um mock para o ID;
    private final AtomicLong counter = new AtomicLong();

    //Gera logs no Console;
    private Logger looger = Logger.getLogger(CreditCardService.class.getName());

    public CreditCard findById(String id) throws ParseException {
                looger.info("Finding Credit Card by ID");
        CreditCard creditCard = new CreditCard();

        creditCard.setId(counter.incrementAndGet());
        creditCard.setCardType(new CardType(1, "Master Card"));
        creditCard.setIssuingBank(new IssuingBank(1, "Nubank"));
        creditCard.setCardIdentifier("Nubank");
        creditCard.setLimit(10000.0);
        creditCard.setClosingDate(new Date());
        creditCard.setDueDate(new Date());
        creditCard.setLastFourDigits(1504);
        creditCard.setCvv(141);
        creditCard.setExpirationDate(new Date());


        return creditCard;

    }
}









