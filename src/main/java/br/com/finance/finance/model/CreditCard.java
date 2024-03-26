package br.com.finance.finance.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.util.Date;

@Entity
@Table(name = "credit_card")
public class CreditCard {

    @Id
    private Long id;

    //private CardType cardType;
    //private IssuingBank issuingBank;

    @Column(name = "card_identifier", nullable = false, length = 100)
    private String cardIdentifier;

    @Column(name = "limit", nullable = false, length = 8)
    private Double limit;

    @Column(name = "closing_date", nullable = false, length = 100)
    private Date closingDate;

    @Column(name = "due_date", nullable = false, length = 100)
    private Date dueDate;

    @Column(name = "last_for_digits", nullable = false, length = 4)
    private Integer lastFourDigits;

    @Column(name = "cvv", nullable = false, length = 3)
    private Integer cvv;

    @Column(name = "expiration_date", nullable = false, length = 100)
    private Date expirationDate;

    public CreditCard() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
//
//    public CardType getCardType() {
//        return cardType;
//    }
//
//    public void setCardType(CardType cardType) {
//        this.cardType = cardType;
//    }
//
//    public IssuingBank getIssuingBank() {
//        return issuingBank;
//    }
//
//    public void setIssuingBank(IssuingBank issuingBank) {
//        this.issuingBank = issuingBank;
//    }

    public String getCardIdentifier() {
        return cardIdentifier;
    }

    public void setCardIdentifier(String cardIdentifier) {
        this.cardIdentifier = cardIdentifier;
    }

    public Double getLimit() {
        return limit;
    }

    public void setLimit(Double limit) {
        this.limit = limit;
    }

    public Date getClosingDate() {
        return closingDate;
    }

    public void setClosingDate(Date closingDate) {
        this.closingDate = closingDate;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public Integer getLastFourDigits() {
        return lastFourDigits;
    }

    public void setLastFourDigits(Integer lastFourDigits) {
        this.lastFourDigits = lastFourDigits;
    }

    public Integer getCvv() {
        return cvv;
    }

    public void setCvv(Integer cvv) {
        this.cvv = cvv;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }


}
