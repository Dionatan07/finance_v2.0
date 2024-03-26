package br.com.finance.finance.model;

public class IssuingBank {

    private Long id;
    private String bankName;

    public IssuingBank(Long id, String bankName) {
        this.id = id;
        this.bankName = bankName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }
}
